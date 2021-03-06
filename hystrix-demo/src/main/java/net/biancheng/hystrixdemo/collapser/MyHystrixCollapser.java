package net.biancheng.hystrixdemo.collapser;

import com.netflix.hystrix.HystrixCollapser;
import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandKey;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyHystrixCollapser extends HystrixCollapser<List<String>,String,String> {

    private final String name;

    public MyHystrixCollapser(String name){
        this.name = name;
    }

    @Override
    public String getRequestArgument() {
        return name;
    }

    @Override
    protected HystrixCommand<List<String>> createCommand(Collection<CollapsedRequest<String, String>> collection) {
        return new BatchCommand(collection);
    }

    @Override
    protected void mapResponseToRequests(List<String> batchResponse, Collection<CollapsedRequest<String, String>> requests) {
        int count = 0;
        for (CollapsedRequest<String,String> request : requests){
            request.setResponse(batchResponse.get(count++));
        }
    }

    public static final class BatchCommand extends  HystrixCommand<List<String>> {

        private final Collection<CollapsedRequest<String,String>> requests;

        public BatchCommand(Collection<CollapsedRequest<String,String>> requests) {
            super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                    .andCommandKey(HystrixCommandKey.Factory.asKey("GetValueForKey")));
            this.requests = requests;
        }

        @Override
        protected List<String> run() throws Exception {
            System.out.println("真正执行请求。。。。。");
            ArrayList<String> response = new ArrayList<String>();
            for (CollapsedRequest<String,String> request : requests){
                response.add("返回结果：" + request.getArgument());
            }
            return response;
        }
    }
}

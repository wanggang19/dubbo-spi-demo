package com.dubbo.spi.demo.consumer.filter;

/*import com.alibaba.dubbo.rpc.Invoker;
import com.alibaba.dubbo.rpc.RpcContext;
import com.alibaba.dubbo.rpc.RpcException;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.*;
import org.slf4j.MDC;
import org.springframework.util.StringUtils;*/

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/8/13 17:07
 * @Description:
 */
/*@Activate(group = CommonConstants.CONSUMER, value = "nopTrace")
public class DubboTraceFilter implements Filter {
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        String traceId = RpcContext.getContext().getAttachment("traceId");
        String consumerName = RpcContext.getContext().getAttachment("INSIGHT_ENTRY_APP_NAME");
        if (StringUtils.isEmpty(traceId)) {
            traceId = String.valueOf("1231213432");
        }
        traceId = consumerName + ":" +traceId;
        MDC.put("traceId", traceId);
        return invoker.invoke(invocation);
    }
}*/

package com.yingzi.center.breeding.interceptor;

import com.dtyunxi.huieryun.log.LoggerFactory;
import com.yingzi.center.breeding.service.impl.CenterEventServiceImpl;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import javax.annotation.Resource;
import java.lang.reflect.Method;

/**
 * @ClassName: CenterEventInterceptor
 * @Description: (事件中心拦截类)
 * @Author JIEDONG
 * @Date 2018-04-19
 * @Version V1.0
 * @Copyright Guangzhou Shadow Holding Co.,Ltd
 */
@Aspect
@Component
public class CenterEventInterceptor {
    private static final Logger logger = LoggerFactory.getLogger(CenterEventInterceptor.class);

    @Resource
    CenterEventServiceImpl centerEventServiceImpl;
    /**
     * 定义拦截规则：拦截com.yingzi.center.breeding.service.impl 包下面的所有类中
     */
    @SuppressWarnings("all")
    @Pointcut("(execution(* com.yingzi.center.breeding.mapper.*.insert*(..))) or  (execution(* com.yingzi.center.breeding.mapper.*.update*(..))) or (execution(* com.yingzi.center.breeding.mapper.*.delete*(..)))")
    public void interceptPointcut(){};

    /**
     * 拦截器具体实现
     * @param pjp
     * @return （被拦截方法的执行结果，或需要登录的错误提示。）
     */

    @Around("interceptPointcut()")
    public Object syncCenterEvent(ProceedingJoinPoint pjp) throws Throwable{
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        //获取被拦截的方法
        Method method = signature.getMethod();
        //获取被拦截的方法名
        String methodName = method.getName();

        Object result = null;
        Object[] args = pjp.getArgs();
        logger.debug("intercepting method: { } ", methodName );

        if(args == null || args.length==0){
            return pjp.proceed();
        }
        result = pjp.proceed();
        centerEventServiceImpl.syncCenterEvent(methodName, args[0]);
        return result;
    }

}
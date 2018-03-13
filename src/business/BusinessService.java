package business;

import business.exception.BizException;
import business.pojo.AbstractPojo;
import net.sf.json.JSONObject;

/**
 * 所有进行具体业务处理的
 */
public interface BusinessService<T extends AbstractPojo> {
    /**
     * 业务方法
     *
     * @param params 服务请求者传递的参数信息
     * @return 只要是AbstractPojo类的业务子类，都可以进行返回
     * @throws BizException 业务处理过程如果出现异常，则进行抛出
     */
    T handle(JSONObject params) throws BizException;
}

package com.example.test.service;

import com.example.test.entity.AuthorDto;
import com.example.test.utils.WsConst;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

/**
 * 创建服务接口
 * @author oKong
 *
 */
@WebService(targetNamespace = WsConst.NAMESPACE_URI ,name = "authorPortType")
public interface AuthorService {

    /**
     * 根据名称获取作者信息
     * @author 作者：oKong
     */
    @WebMethod(operationName="getAuthorByName")
    AuthorDto getAuthor(@WebParam(name = "authorName") String name);

    /**
     * 获取作者列表信息
     * @author oKong
     */
    @WebMethod
    List<AuthorDto> getAuthorList();
    
    /**
     * 返回字符串测试
     * @author oKong
     */
    String getAuthorString(@WebParam(name = "authorName")String name);
}
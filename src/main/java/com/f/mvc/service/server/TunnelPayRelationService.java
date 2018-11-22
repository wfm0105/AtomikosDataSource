package com.f.mvc.service.server;

import com.f.mvc.entity.server.TunnelPayRelation;

import java.util.List;

/**
 * @author rebysfu@gmail.com
 * @description：
 * @create 2018-10-10 下午4:42
 **/
public interface TunnelPayRelationService {
    int addNewTunnelPayRelation(TunnelPayRelation tunnelPayRelation);

    int turnOperation(TunnelPayRelation tunnelPayRelation);

    TunnelPayRelation findByTunnelPayId(final String tunnelPayId);

    TunnelPayRelation findByPayTypeAndTunnelId(final Integer payType, final String tunnelId);

    List<TunnelPayRelation> findByPayType(final Integer payType);

    List<TunnelPayRelation> findAll();

    int update(TunnelPayRelation tunnelPayRelation);

    List<TunnelPayRelation> findByTunnelId(String tunnelId);
}
package com.aby.fsd.handson.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.aby.fsd.handson.domain.Domain;
import com.mongodb.client.result.UpdateResult;

public class DomainRepositoryImpl implements CustomDomainRepository {

	@Autowired
    MongoTemplate mongoTemplate;

    @Override
    public int updateDomain(String domain, boolean displayAds) {

        Query query = new Query(Criteria.where("domain").is(domain));
        Update update = new Update();
        update.set("displayAds", displayAds);

        UpdateResult result = mongoTemplate.updateFirst(query, update, Domain.class);

        if(result!=null)
            return (int) result.getModifiedCount();
        else
            return 0;

    }
}

package com.aby.fsd.handson.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "domain")
public class Domain {
	
	@Id
    private long id;

    private String domain;

    private boolean displayAds;
    
    public Domain(String domain, boolean  displayAds) {
        this.domain = domain;
        this.displayAds = displayAds;
    }


}

package com.example.ldap.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.AttributesMapper;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;
import static org.springframework.ldap.query.LdapQueryBuilder.query;
import org.springframework.stereotype.Service;

/**
 * Created by amabb on 24/03/17.
 */

@Service
public class LDAPService {

    @Autowired
    private final LdapTemplate ldapTemplate;

    public LDAPService(LdapTemplate ldapTemplate) {
        this.ldapTemplate = ldapTemplate;
    }


    public String getPersonNameByLastName(String lastName) {

        LdapQuery query = query()
                .attributes("cn", "sn")
                .where("objectclass").is("person")
                .and("sn").is(lastName);

        return ldapTemplate.search(query,
                (AttributesMapper<String>) attrs -> (String) attrs.get("cn").get()).get(0);

    }
}

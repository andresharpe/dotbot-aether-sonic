package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes.dex */
public class RulesConfigurationType implements Serializable {

    /* renamed from: E, reason: collision with root package name */
    private List<MappingRule> f24042E;

    public List<MappingRule> a() {
        return this.f24042E;
    }

    public void b(Collection<MappingRule> collection) {
        if (collection == null) {
            this.f24042E = null;
        } else {
            this.f24042E = new ArrayList(collection);
        }
    }

    public RulesConfigurationType c(Collection<MappingRule> collection) {
        b(collection);
        return this;
    }

    public RulesConfigurationType d(MappingRule... mappingRuleArr) {
        if (a() == null) {
            this.f24042E = new ArrayList(mappingRuleArr.length);
        }
        for (MappingRule mappingRule : mappingRuleArr) {
            this.f24042E.add(mappingRule);
        }
        return this;
    }

    public boolean equals(Object obj) {
        boolean z3;
        boolean z4;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof RulesConfigurationType)) {
            return false;
        }
        RulesConfigurationType rulesConfigurationType = (RulesConfigurationType) obj;
        if (rulesConfigurationType.a() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (a() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (rulesConfigurationType.a() == null || rulesConfigurationType.a().equals(a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        if (a() == null) {
            hashCode = 0;
        } else {
            hashCode = a().hashCode();
        }
        return 31 + hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (a() != null) {
            sb.append("Rules: " + a());
        }
        sb.append("}");
        return sb.toString();
    }
}

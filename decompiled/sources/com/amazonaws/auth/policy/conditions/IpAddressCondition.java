package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class IpAddressCondition extends b {

    /* loaded from: classes.dex */
    public enum IpAddressComparisonType {
        IpAddress,
        NotIpAddress
    }

    public IpAddressCondition(String str) {
        this(IpAddressComparisonType.IpAddress, str);
    }

    public IpAddressCondition(IpAddressComparisonType ipAddressComparisonType, String str) {
        this.f23459a = ipAddressComparisonType.toString();
        this.f23460b = a.f23468c;
        this.f23461c = Arrays.asList(str);
    }
}

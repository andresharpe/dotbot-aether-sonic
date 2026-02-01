package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class ArnCondition extends b {

    /* loaded from: classes.dex */
    public enum ArnComparisonType {
        ArnEquals,
        ArnLike,
        ArnNotEquals,
        ArnNotLike
    }

    public ArnCondition(ArnComparisonType arnComparisonType, String str, String str2) {
        this.f23459a = arnComparisonType.toString();
        this.f23460b = str;
        this.f23461c = Arrays.asList(str2);
    }
}

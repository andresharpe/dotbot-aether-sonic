package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class StringCondition extends b {

    /* loaded from: classes.dex */
    public enum StringComparisonType {
        StringEquals,
        StringEqualsIgnoreCase,
        StringLike,
        StringNotEquals,
        StringNotEqualsIgnoreCase,
        StringNotLike
    }

    public StringCondition(StringComparisonType stringComparisonType, String str, String str2) {
        this.f23459a = stringComparisonType.toString();
        this.f23460b = str;
        this.f23461c = Arrays.asList(str2);
    }
}

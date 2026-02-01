package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class NumericCondition extends b {

    /* loaded from: classes.dex */
    public enum NumericComparisonType {
        NumericEquals,
        NumericGreaterThan,
        NumericGreaterThanEquals,
        NumericLessThan,
        NumericLessThanEquals,
        NumericNotEquals
    }

    public NumericCondition(NumericComparisonType numericComparisonType, String str, String str2) {
        this.f23459a = numericComparisonType.toString();
        this.f23460b = str;
        this.f23461c = Arrays.asList(str2);
    }
}

package com.amazonaws.auth.policy.conditions;

import com.amazonaws.auth.policy.b;
import com.amazonaws.util.k;
import java.util.Arrays;
import java.util.Date;

/* loaded from: classes.dex */
public class DateCondition extends b {

    /* loaded from: classes.dex */
    public enum DateComparisonType {
        DateEquals,
        DateGreaterThan,
        DateGreaterThanEquals,
        DateLessThan,
        DateLessThanEquals,
        DateNotEquals
    }

    public DateCondition(DateComparisonType dateComparisonType, Date date) {
        this.f23459a = dateComparisonType.toString();
        this.f23460b = a.f23466a;
        this.f23461c = Arrays.asList(k.d(date));
    }
}

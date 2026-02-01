package com.amazonaws.util;

import com.amazonaws.logging.LogFactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class y extends x {

    /* renamed from: f, reason: collision with root package name */
    private final Map<String, List<x>> f24372f;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, Number> f24373g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(Long l4, long j4, Long l5) {
        super(l4, j4, l5);
        this.f24372f = new HashMap();
        this.f24373g = new HashMap();
    }

    @Override // com.amazonaws.util.x
    public void B(String str, long j4) {
        this.f24373g.put(str, Long.valueOf(j4));
    }

    @Override // com.amazonaws.util.x
    public void a(String str, x xVar) {
        List<x> list = this.f24372f.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f24372f.put(str, list);
        }
        if (xVar.x()) {
            list.add(xVar);
            return;
        }
        LogFactory.c(getClass()).a("Skip submeasurement timing info with no end time for " + str);
    }

    @Override // com.amazonaws.util.x
    public Map<String, Number> d() {
        return this.f24373g;
    }

    @Override // com.amazonaws.util.x
    public List<x> e(String str) {
        return this.f24372f.get(str);
    }

    @Override // com.amazonaws.util.x
    public Number f(String str) {
        return this.f24373g.get(str);
    }

    @Override // com.amazonaws.util.x
    public x m(String str) {
        List<x> list;
        Map<String, List<x>> map = this.f24372f;
        if (map == null || map.size() == 0 || (list = this.f24372f.get(str)) == null || list.size() == 0) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    @Override // com.amazonaws.util.x
    public x r(String str) {
        return s(str, 0);
    }

    @Override // com.amazonaws.util.x
    public x s(String str, int i4) {
        List<x> list = this.f24372f.get(str);
        if (i4 >= 0 && list != null && list.size() != 0 && i4 < list.size()) {
            return list.get(i4);
        }
        return null;
    }

    @Override // com.amazonaws.util.x
    public Map<String, List<x>> t() {
        return this.f24372f;
    }

    @Override // com.amazonaws.util.x
    public void w(String str) {
        int i4;
        Number f4 = f(str);
        if (f4 != null) {
            i4 = f4.intValue();
        } else {
            i4 = 0;
        }
        B(str, i4 + 1);
    }
}

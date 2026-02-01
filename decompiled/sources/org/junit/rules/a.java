package org.junit.rules;

import java.util.List;
import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class a implements l {

    /* renamed from: a, reason: collision with root package name */
    private final l f55661a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f55662b;

    public a(l lVar) {
        this(lVar, org.junit.internal.management.c.a().a());
    }

    private static boolean c(List<String> list) {
        for (String str : list) {
            if ("-Xdebug".equals(str) || str.startsWith("-agentlib:jdwp")) {
                return true;
            }
        }
        return false;
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        if (this.f55662b) {
            return iVar;
        }
        return this.f55661a.a(iVar, description);
    }

    public boolean b() {
        return this.f55662b;
    }

    a(l lVar, List<String> list) {
        this.f55661a = lVar;
        this.f55662b = c(list);
    }
}

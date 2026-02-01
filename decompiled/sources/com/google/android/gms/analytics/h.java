package com.google.android.gms.analytics;

import android.content.Context;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.os.C0745h;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

@com.google.android.gms.common.util.D
/* loaded from: classes.dex */
public class h implements InterfaceC1155c {

    /* renamed from: a, reason: collision with root package name */
    private final TreeSet f27793a = new TreeSet();

    public h(@N Context context, @N Collection<String> collection) {
        e(context, collection);
    }

    @Override // com.google.android.gms.analytics.InterfaceC1155c
    @N
    public String a(@P String str, @N Throwable th) {
        return d(c(th), b(c(th)), str);
    }

    @P
    protected StackTraceElement b(@N Throwable th) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        if (stackTrace != null && (stackTrace.length) != 0) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                Iterator it = this.f27793a.iterator();
                while (it.hasNext()) {
                    if (className.startsWith((String) it.next())) {
                        return stackTraceElement;
                    }
                }
            }
            return stackTrace[0];
        }
        return null;
    }

    @N
    protected Throwable c(@N Throwable th) {
        while (th.getCause() != null) {
            th = th.getCause();
        }
        return th;
    }

    @N
    protected String d(@N Throwable th, @P StackTraceElement stackTraceElement, @P String str) {
        String str2;
        int length;
        StringBuilder sb = new StringBuilder();
        sb.append(th.getClass().getSimpleName());
        if (stackTraceElement != null) {
            String[] split = stackTraceElement.getClassName().split("\\.");
            if (split != null && (length = split.length) > 0) {
                str2 = split[length - 1];
            } else {
                str2 = C0745h.f12738b;
            }
            sb.append(String.format(" (@%s:%s:%s)", str2, stackTraceElement.getMethodName(), Integer.valueOf(stackTraceElement.getLineNumber())));
        }
        if (str != null) {
            sb.append(String.format(" {%s}", str));
        }
        return sb.toString();
    }

    public void e(@N Context context, @N Collection<String> collection) {
        this.f27793a.clear();
        HashSet<String> hashSet = new HashSet();
        if (collection != null) {
            hashSet.addAll(collection);
        }
        if (context != null) {
            hashSet.add(context.getApplicationContext().getPackageName());
        }
        for (String str : hashSet) {
            Iterator it = this.f27793a.iterator();
            boolean z3 = true;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String str2 = (String) it.next();
                if (!str.startsWith(str2)) {
                    if (str2.startsWith(str)) {
                        this.f27793a.remove(str2);
                    }
                } else {
                    z3 = false;
                }
            }
            if (z3) {
                this.f27793a.add(str);
            }
        }
    }
}

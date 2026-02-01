package com.google.android.gms.common.api;

import androidx.annotation.N;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.common.api.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1165b extends BasePendingResult<C1166c> {

    /* renamed from: a, reason: collision with root package name */
    private int f28045a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28046b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28047c;

    /* renamed from: d, reason: collision with root package name */
    private final l<?>[] f28048d;

    /* renamed from: e, reason: collision with root package name */
    private final Object f28049e;

    /* renamed from: com.google.android.gms.common.api.b$a */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private List<l<?>> f28050a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private i f28051b;

        public a(@N i iVar) {
            this.f28051b = iVar;
        }

        @N
        public <R extends q> C1167d<R> a(@N l<R> lVar) {
            C1167d<R> c1167d = new C1167d<>(this.f28050a.size());
            this.f28050a.add(lVar);
            return c1167d;
        }

        @N
        public C1165b b() {
            return new C1165b(this.f28050a, this.f28051b, null);
        }
    }

    /* synthetic */ C1165b(List list, i iVar, x xVar) {
        super(iVar);
        this.f28049e = new Object();
        int size = list.size();
        this.f28045a = size;
        l<?>[] lVarArr = new l[size];
        this.f28048d = lVarArr;
        if (!list.isEmpty()) {
            for (int i4 = 0; i4 < list.size(); i4++) {
                l<?> lVar = (l) list.get(i4);
                this.f28048d[i4] = lVar;
                lVar.addStatusListener(new w(this));
            }
            return;
        }
        setResult(new C1166c(Status.f28025K, lVarArr));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.l
    public void cancel() {
        super.cancel();
        for (l<?> lVar : this.f28048d) {
            lVar.cancel();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @N
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public C1166c createFailedResult(@N Status status) {
        return new C1166c(status, this.f28048d);
    }
}

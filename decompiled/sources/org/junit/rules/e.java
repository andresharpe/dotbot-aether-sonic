package org.junit.rules;

import java.util.ArrayList;
import org.junit.runner.Description;
import org.junit.runners.model.MultipleFailureException;

/* loaded from: classes2.dex */
public abstract class e implements l {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends org.junit.runners.model.i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.junit.runners.model.i f55673a;

        a(org.junit.runners.model.i iVar) {
            this.f55673a = iVar;
        }

        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0016 -> B:5:0x0023). Please report as a decompilation issue!!! */
        @Override // org.junit.runners.model.i
        public void a() throws Throwable {
            e.this.c();
            ArrayList arrayList = new ArrayList();
            try {
                try {
                    this.f55673a.a();
                    e.this.b();
                } catch (Throwable th) {
                    arrayList.add(th);
                }
            } catch (Throwable th2) {
                try {
                    arrayList.add(th2);
                    e.this.b();
                } catch (Throwable th3) {
                    try {
                        e.this.b();
                    } catch (Throwable th4) {
                        arrayList.add(th4);
                    }
                    throw th3;
                }
            }
            MultipleFailureException.a(arrayList);
        }
    }

    private org.junit.runners.model.i d(org.junit.runners.model.i iVar) {
        return new a(iVar);
    }

    @Override // org.junit.rules.l
    public org.junit.runners.model.i a(org.junit.runners.model.i iVar, Description description) {
        return d(iVar);
    }

    protected void b() {
    }

    protected void c() throws Throwable {
    }
}

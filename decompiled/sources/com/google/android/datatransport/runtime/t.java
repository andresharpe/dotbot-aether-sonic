package com.google.android.datatransport.runtime;

/* loaded from: classes.dex */
final class t<T> implements com.google.android.datatransport.g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final q f27702a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27703b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.android.datatransport.c f27704c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.android.datatransport.f<T, byte[]> f27705d;

    /* renamed from: e, reason: collision with root package name */
    private final u f27706e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(q qVar, String str, com.google.android.datatransport.c cVar, com.google.android.datatransport.f<T, byte[]> fVar, u uVar) {
        this.f27702a = qVar;
        this.f27703b = str;
        this.f27704c = cVar;
        this.f27705d = fVar;
        this.f27706e = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Exception exc) {
    }

    @Override // com.google.android.datatransport.g
    public void a(com.google.android.datatransport.d<T> dVar) {
        b(dVar, new com.google.android.datatransport.i() { // from class: com.google.android.datatransport.runtime.s
            @Override // com.google.android.datatransport.i
            public final void a(Exception exc) {
                t.d(exc);
            }
        });
    }

    @Override // com.google.android.datatransport.g
    public void b(com.google.android.datatransport.d<T> dVar, com.google.android.datatransport.i iVar) {
        this.f27706e.a(p.a().f(this.f27702a).c(dVar).g(this.f27703b).e(this.f27705d).b(this.f27704c).a(), iVar);
    }
}

package com.google.firebase.crashlytics.internal;

import C1.a;
import androidx.annotation.N;
import com.google.firebase.crashlytics.internal.model.B;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class e implements com.google.firebase.crashlytics.internal.a {

    /* renamed from: c, reason: collision with root package name */
    private static final g f35223c = new b();

    /* renamed from: a, reason: collision with root package name */
    private final C1.a<com.google.firebase.crashlytics.internal.a> f35224a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<com.google.firebase.crashlytics.internal.a> f35225b = new AtomicReference<>(null);

    /* loaded from: classes2.dex */
    private static final class b implements g {
        private b() {
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File a() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File b() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File c() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File d() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File e() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File f() {
            return null;
        }

        @Override // com.google.firebase.crashlytics.internal.g
        public File g() {
            return null;
        }
    }

    public e(C1.a<com.google.firebase.crashlytics.internal.a> aVar) {
        this.f35224a = aVar;
        aVar.a(new a.InterfaceC0003a() { // from class: com.google.firebase.crashlytics.internal.b
            @Override // C1.a.InterfaceC0003a
            public final void a(C1.b bVar) {
                e.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(String str, C1.b bVar) {
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).a(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(C1.b bVar) {
        f.f().b("Crashlytics native component now available.");
        this.f35225b.set((com.google.firebase.crashlytics.internal.a) bVar.get());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void j(String str, String str2, long j4, B b4, C1.b bVar) {
        ((com.google.firebase.crashlytics.internal.a) bVar.get()).d(str, str2, j4, b4);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public void a(@N final String str) {
        this.f35224a.a(new a.InterfaceC0003a() { // from class: com.google.firebase.crashlytics.internal.c
            @Override // C1.a.InterfaceC0003a
            public final void a(C1.b bVar) {
                e.h(str, bVar);
            }
        });
    }

    @Override // com.google.firebase.crashlytics.internal.a
    @N
    public g b(@N String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f35225b.get();
        if (aVar == null) {
            return f35223c;
        }
        return aVar.b(str);
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public boolean c(@N String str) {
        com.google.firebase.crashlytics.internal.a aVar = this.f35225b.get();
        if (aVar != null && aVar.c(str)) {
            return true;
        }
        return false;
    }

    @Override // com.google.firebase.crashlytics.internal.a
    public void d(@N final String str, @N final String str2, final long j4, @N final B b4) {
        f.f().k("Deferring native open session: " + str);
        this.f35224a.a(new a.InterfaceC0003a() { // from class: com.google.firebase.crashlytics.internal.d
            @Override // C1.a.InterfaceC0003a
            public final void a(C1.b bVar) {
                e.j(str, str2, j4, b4, bVar);
            }
        });
    }
}

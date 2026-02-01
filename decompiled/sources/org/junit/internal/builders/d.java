package org.junit.internal.builders;

import org.junit.runner.Description;
import org.junit.runner.j;

/* loaded from: classes2.dex */
public class d extends j {

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f55557a;

    public d(Class<?> cls) {
        this.f55557a = cls;
    }

    @Override // org.junit.runner.j, org.junit.runner.b
    public Description a() {
        return Description.c(this.f55557a);
    }

    @Override // org.junit.runner.j
    public void b(org.junit.runner.notification.b bVar) {
        bVar.i(a());
    }
}

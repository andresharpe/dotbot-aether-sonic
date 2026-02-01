package junit.framework;

import org.junit.runner.Description;

/* loaded from: classes2.dex */
public class d implements f, org.junit.runner.b {

    /* renamed from: a, reason: collision with root package name */
    private final Description f51510a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Description description) {
        this.f51510a = description;
    }

    @Override // org.junit.runner.b
    public Description a() {
        return this.f51510a;
    }

    @Override // junit.framework.f
    public int b() {
        return 1;
    }

    @Override // junit.framework.f
    public void d(j jVar) {
        throw new RuntimeException("This test stub created only for informational purposes.");
    }

    public String toString() {
        return a().toString();
    }
}

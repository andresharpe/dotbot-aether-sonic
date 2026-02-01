package kotlinx.coroutines;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: kotlinx.coroutines.q0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2334q0 implements E0 {

    /* renamed from: E, reason: collision with root package name */
    private final boolean f54547E;

    public C2334q0(boolean z3) {
        this.f54547E = z3;
    }

    @Override // kotlinx.coroutines.E0
    @l3.e
    public X0 D() {
        return null;
    }

    @Override // kotlinx.coroutines.E0
    public boolean c() {
        return this.f54547E;
    }

    @l3.d
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        if (c()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}

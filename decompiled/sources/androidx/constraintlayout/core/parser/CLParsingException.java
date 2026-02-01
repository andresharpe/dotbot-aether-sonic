package androidx.constraintlayout.core.parser;

import androidx.core.os.C0745h;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: E, reason: collision with root package name */
    private final String f7594E;

    /* renamed from: F, reason: collision with root package name */
    private final int f7595F;

    /* renamed from: G, reason: collision with root package name */
    private final String f7596G;

    public CLParsingException(String str, c cVar) {
        this.f7594E = str;
        if (cVar != null) {
            this.f7596G = cVar.n();
            this.f7595F = cVar.l();
        } else {
            this.f7596G = C0745h.f12738b;
            this.f7595F = 0;
        }
    }

    public String a() {
        return this.f7594E + " (" + this.f7596G + " at line " + this.f7595F + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}

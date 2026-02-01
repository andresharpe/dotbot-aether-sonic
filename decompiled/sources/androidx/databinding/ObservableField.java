package androidx.databinding;

import androidx.annotation.P;
import java.io.Serializable;

/* loaded from: classes.dex */
public class ObservableField<T> extends AbstractC0877b implements Serializable {

    /* renamed from: G, reason: collision with root package name */
    static final long f13967G = 1;

    /* renamed from: F, reason: collision with root package name */
    private T f13968F;

    public ObservableField(T t3) {
        this.f13968F = t3;
    }

    @P
    public T h() {
        return this.f13968F;
    }

    public void i(T t3) {
        if (t3 != this.f13968F) {
            this.f13968F = t3;
            e();
        }
    }

    public ObservableField() {
    }

    public ObservableField(u... uVarArr) {
        super(uVarArr);
    }
}

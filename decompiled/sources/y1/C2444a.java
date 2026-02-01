package y1;

import com.google.firebase.components.D;

/* renamed from: y1.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2444a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<T> f58216a;

    /* renamed from: b, reason: collision with root package name */
    private final T f58217b;

    public C2444a(Class<T> cls, T t3) {
        this.f58216a = (Class) D.b(cls);
        this.f58217b = (T) D.b(t3);
    }

    public T a() {
        return this.f58217b;
    }

    public Class<T> b() {
        return this.f58216a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", this.f58216a, this.f58217b);
    }
}

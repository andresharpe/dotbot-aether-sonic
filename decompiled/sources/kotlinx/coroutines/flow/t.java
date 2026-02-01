package kotlinx.coroutines.flow;

/* loaded from: classes2.dex */
public interface t<T> extends H<T>, s<T> {
    @Override // kotlinx.coroutines.flow.H
    T getValue();

    boolean h(T t3, T t4);

    void setValue(T t3);
}

package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.annotation.P;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20458c = -1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f20459d = -2;

    /* renamed from: a, reason: collision with root package name */
    private final DataSetObservable f20460a = new DataSetObservable();

    /* renamed from: b, reason: collision with root package name */
    private DataSetObserver f20461b;

    @Deprecated
    public void a(@N View view, int i4, @N Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    public void b(@N ViewGroup viewGroup, int i4, @N Object obj) {
        a(viewGroup, i4, obj);
    }

    @Deprecated
    public void c(@N View view) {
    }

    public void d(@N ViewGroup viewGroup) {
        c(viewGroup);
    }

    public abstract int e();

    public int f(@N Object obj) {
        return -1;
    }

    @P
    public CharSequence g(int i4) {
        return null;
    }

    public float h(int i4) {
        return 1.0f;
    }

    @N
    @Deprecated
    public Object i(@N View view, int i4) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @N
    public Object j(@N ViewGroup viewGroup, int i4) {
        return i(viewGroup, i4);
    }

    public abstract boolean k(@N View view, @N Object obj);

    public void l() {
        synchronized (this) {
            try {
                DataSetObserver dataSetObserver = this.f20461b;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f20460a.notifyChanged();
    }

    public void m(@N DataSetObserver dataSetObserver) {
        this.f20460a.registerObserver(dataSetObserver);
    }

    public void n(@P Parcelable parcelable, @P ClassLoader classLoader) {
    }

    @P
    public Parcelable o() {
        return null;
    }

    @Deprecated
    public void p(@N View view, int i4, @N Object obj) {
    }

    public void q(@N ViewGroup viewGroup, int i4, @N Object obj) {
        p(viewGroup, i4, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void r(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f20461b = dataSetObserver;
        }
    }

    @Deprecated
    public void s(@N View view) {
    }

    public void t(@N ViewGroup viewGroup) {
        s(viewGroup);
    }

    public void u(@N DataSetObserver dataSetObserver) {
        this.f20460a.unregisterObserver(dataSetObserver);
    }
}

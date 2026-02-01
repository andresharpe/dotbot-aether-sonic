package androidx.emoji2.viewsintegration;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.annotation.RestrictTo;
import androidx.annotation.W;
import androidx.core.util.u;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final b f14583a;

    @W(19)
    /* loaded from: classes.dex */
    private static class a extends b {

        /* renamed from: a, reason: collision with root package name */
        private final TextView f14584a;

        /* renamed from: b, reason: collision with root package name */
        private final d f14585b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f14586c = true;

        a(TextView textView) {
            this.f14584a = textView;
            this.f14585b = new d(textView);
        }

        @N
        private InputFilter[] g(@N InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.f14585b) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.f14585b;
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> h(@N InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i4 = 0; i4 < inputFilterArr.length; i4++) {
                InputFilter inputFilter = inputFilterArr[i4];
                if (inputFilter instanceof d) {
                    sparseArray.put(i4, inputFilter);
                }
            }
            return sparseArray;
        }

        @N
        private InputFilter[] i(@N InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> h4 = h(inputFilterArr);
            if (h4.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - h4.size()];
            int i4 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                if (h4.indexOfKey(i5) < 0) {
                    inputFilterArr2[i4] = inputFilterArr[i5];
                    i4++;
                }
            }
            return inputFilterArr2;
        }

        @P
        private TransformationMethod k(@P TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return ((h) transformationMethod).a();
            }
            return transformationMethod;
        }

        private void l() {
            this.f14584a.setFilters(a(this.f14584a.getFilters()));
        }

        @N
        private TransformationMethod m(@P TransformationMethod transformationMethod) {
            if (transformationMethod instanceof h) {
                return transformationMethod;
            }
            if (transformationMethod instanceof PasswordTransformationMethod) {
                return transformationMethod;
            }
            return new h(transformationMethod);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @N
        InputFilter[] a(@N InputFilter[] inputFilterArr) {
            if (!this.f14586c) {
                return i(inputFilterArr);
            }
            return g(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f14586c;
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z3) {
            if (z3) {
                e();
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z3) {
            this.f14586c = z3;
            e();
            l();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            this.f14584a.setTransformationMethod(f(this.f14584a.getTransformationMethod()));
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @P
        TransformationMethod f(@P TransformationMethod transformationMethod) {
            if (this.f14586c) {
                return m(transformationMethod);
            }
            return k(transformationMethod);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        void j(boolean z3) {
            this.f14586c = z3;
        }
    }

    /* loaded from: classes.dex */
    static class b {
        b() {
        }

        @N
        InputFilter[] a(@N InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        public boolean b() {
            return false;
        }

        void c(boolean z3) {
        }

        void d(boolean z3) {
        }

        void e() {
        }

        @P
        TransformationMethod f(@P TransformationMethod transformationMethod) {
            return transformationMethod;
        }
    }

    @W(19)
    /* loaded from: classes.dex */
    private static class c extends b {

        /* renamed from: a, reason: collision with root package name */
        private final a f14587a;

        c(TextView textView) {
            this.f14587a = new a(textView);
        }

        private boolean g() {
            return !androidx.emoji2.text.g.n();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @N
        InputFilter[] a(@N InputFilter[] inputFilterArr) {
            if (g()) {
                return inputFilterArr;
            }
            return this.f14587a.a(inputFilterArr);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        public boolean b() {
            return this.f14587a.b();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void c(boolean z3) {
            if (g()) {
                return;
            }
            this.f14587a.c(z3);
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void d(boolean z3) {
            if (g()) {
                this.f14587a.j(z3);
            } else {
                this.f14587a.d(z3);
            }
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        void e() {
            if (g()) {
                return;
            }
            this.f14587a.e();
        }

        @Override // androidx.emoji2.viewsintegration.f.b
        @P
        TransformationMethod f(@P TransformationMethod transformationMethod) {
            if (g()) {
                return transformationMethod;
            }
            return this.f14587a.f(transformationMethod);
        }
    }

    public f(@N TextView textView) {
        this(textView, true);
    }

    @N
    public InputFilter[] a(@N InputFilter[] inputFilterArr) {
        return this.f14583a.a(inputFilterArr);
    }

    public boolean b() {
        return this.f14583a.b();
    }

    public void c(boolean z3) {
        this.f14583a.c(z3);
    }

    public void d(boolean z3) {
        this.f14583a.d(z3);
    }

    public void e() {
        this.f14583a.e();
    }

    @P
    public TransformationMethod f(@P TransformationMethod transformationMethod) {
        return this.f14583a.f(transformationMethod);
    }

    public f(@N TextView textView, boolean z3) {
        u.m(textView, "textView cannot be null");
        if (!z3) {
            this.f14583a = new c(textView);
        } else {
            this.f14583a = new a(textView);
        }
    }
}

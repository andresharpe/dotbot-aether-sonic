package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0592e;
import androidx.appcompat.widget.C0594g;
import androidx.appcompat.widget.C0595h;
import androidx.appcompat.widget.C0596i;
import androidx.appcompat.widget.C0600m;
import androidx.appcompat.widget.C0607u;
import androidx.appcompat.widget.C0609w;
import androidx.appcompat.widget.C0611y;
import androidx.appcompat.widget.d0;
import androidx.core.view.C0823k0;
import d.C2042a;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class u {

    /* renamed from: h, reason: collision with root package name */
    private static final String f4993h = "AppCompatViewInflater";

    /* renamed from: a, reason: collision with root package name */
    private final Object[] f4995a = new Object[2];

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f4987b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f4988c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f4989d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f4990e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f4991f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f4992g = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: i, reason: collision with root package name */
    private static final androidx.collection.l<String, Constructor<? extends View>> f4994i = new androidx.collection.l<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements View.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        private final View f4996E;

        /* renamed from: F, reason: collision with root package name */
        private final String f4997F;

        /* renamed from: G, reason: collision with root package name */
        private Method f4998G;

        /* renamed from: H, reason: collision with root package name */
        private Context f4999H;

        public a(@N View view, @N String str) {
            this.f4996E = view;
            this.f4997F = str;
        }

        private void a(@P Context context) {
            String str;
            Method method;
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f4997F, View.class)) != null) {
                        this.f4998G = method;
                        this.f4999H = context;
                        return;
                    }
                } catch (NoSuchMethodException unused) {
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    context = null;
                }
            }
            int id = this.f4996E.getId();
            if (id == -1) {
                str = "";
            } else {
                str = " with id '" + this.f4996E.getContext().getResources().getResourceEntryName(id) + "'";
            }
            throw new IllegalStateException("Could not find method " + this.f4997F + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + this.f4996E.getClass() + str);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(@N View view) {
            if (this.f4998G == null) {
                a(this.f4996E.getContext());
            }
            try {
                this.f4998G.invoke(this.f4999H, view);
            } catch (IllegalAccessException e4) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e4);
            } catch (InvocationTargetException e5) {
                throw new IllegalStateException("Could not execute method for android:onClick", e5);
            }
        }
    }

    private void a(@N Context context, @N View view, @N AttributeSet attributeSet) {
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4989d);
        if (obtainStyledAttributes.hasValue(0)) {
            C0823k0.C1(view, obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f4990e);
        if (obtainStyledAttributes2.hasValue(0)) {
            C0823k0.E1(view, obtainStyledAttributes2.getString(0));
        }
        obtainStyledAttributes2.recycle();
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f4991f);
        if (obtainStyledAttributes3.hasValue(0)) {
            C0823k0.n2(view, obtainStyledAttributes3.getBoolean(0, false));
        }
        obtainStyledAttributes3.recycle();
    }

    private void b(View view, AttributeSet attributeSet) {
        Context context = view.getContext();
        if ((context instanceof ContextWrapper) && C0823k0.K0(view)) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4988c);
            String string = obtainStyledAttributes.getString(0);
            if (string != null) {
                view.setOnClickListener(new a(view, string));
            }
            obtainStyledAttributes.recycle();
        }
    }

    private View s(Context context, String str, String str2) throws ClassNotFoundException, InflateException {
        String str3;
        androidx.collection.l<String, Constructor<? extends View>> lVar = f4994i;
        Constructor<? extends View> constructor = lVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f4987b);
            lVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f4995a);
    }

    private View t(Context context, String str, AttributeSet attributeSet) {
        if (str.equals(com.google.android.gms.analytics.ecommerce.c.f27782c)) {
            str = attributeSet.getAttributeValue(null, "class");
        }
        try {
            Object[] objArr = this.f4995a;
            objArr[0] = context;
            objArr[1] = attributeSet;
            if (-1 == str.indexOf(46)) {
                int i4 = 0;
                while (true) {
                    String[] strArr = f4992g;
                    if (i4 >= strArr.length) {
                        return null;
                    }
                    View s4 = s(context, str, strArr[i4]);
                    if (s4 != null) {
                        return s4;
                    }
                    i4++;
                }
            } else {
                return s(context, str, null);
            }
        } catch (Exception unused) {
            return null;
        } finally {
            Object[] objArr2 = this.f4995a;
            objArr2[0] = null;
            objArr2[1] = null;
        }
    }

    private static Context u(Context context, AttributeSet attributeSet, boolean z3, boolean z4) {
        int i4;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.K6, 0, 0);
        if (z3) {
            i4 = obtainStyledAttributes.getResourceId(C2042a.m.L6, 0);
        } else {
            i4 = 0;
        }
        if (z4 && i4 == 0 && (i4 = obtainStyledAttributes.getResourceId(C2042a.m.P6, 0)) != 0) {
            Log.i(f4993h, "app:theme is now deprecated. Please move to using android:theme instead.");
        }
        obtainStyledAttributes.recycle();
        if (i4 != 0) {
            if (!(context instanceof androidx.appcompat.view.d) || ((androidx.appcompat.view.d) context).c() != i4) {
                return new androidx.appcompat.view.d(context, i4);
            }
            return context;
        }
        return context;
    }

    private void v(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @N
    protected C0592e c(Context context, AttributeSet attributeSet) {
        return new C0592e(context, attributeSet);
    }

    @N
    protected C0594g d(Context context, AttributeSet attributeSet) {
        return new C0594g(context, attributeSet);
    }

    @N
    protected C0595h e(Context context, AttributeSet attributeSet) {
        return new C0595h(context, attributeSet);
    }

    @N
    protected C0596i f(Context context, AttributeSet attributeSet) {
        return new C0596i(context, attributeSet);
    }

    @N
    protected C0600m g(Context context, AttributeSet attributeSet) {
        return new C0600m(context, attributeSet);
    }

    @N
    protected AppCompatImageButton h(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @N
    protected AppCompatImageView i(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @N
    protected androidx.appcompat.widget.r j(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.r(context, attributeSet);
    }

    @N
    protected AppCompatRadioButton k(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @N
    protected C0607u l(Context context, AttributeSet attributeSet) {
        return new C0607u(context, attributeSet);
    }

    @N
    protected C0609w m(Context context, AttributeSet attributeSet) {
        return new C0609w(context, attributeSet);
    }

    @N
    protected C0611y n(Context context, AttributeSet attributeSet) {
        return new C0611y(context, attributeSet);
    }

    @N
    protected AppCompatTextView o(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @N
    protected androidx.appcompat.widget.E p(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.E(context, attributeSet);
    }

    @P
    protected View q(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    @P
    public final View r(@P View view, @N String str, @N Context context, @N AttributeSet attributeSet, boolean z3, boolean z4, boolean z5, boolean z6) {
        Context context2;
        View l4;
        if (z3 && view != null) {
            context2 = view.getContext();
        } else {
            context2 = context;
        }
        if (z4 || z5) {
            context2 = u(context2, attributeSet, z4, z5);
        }
        if (z6) {
            context2 = d0.b(context2);
        }
        str.hashCode();
        char c4 = 65535;
        switch (str.hashCode()) {
            case -1946472170:
                if (str.equals("RatingBar")) {
                    c4 = 0;
                    break;
                }
                break;
            case -1455429095:
                if (str.equals("CheckedTextView")) {
                    c4 = 1;
                    break;
                }
                break;
            case -1346021293:
                if (str.equals("MultiAutoCompleteTextView")) {
                    c4 = 2;
                    break;
                }
                break;
            case -938935918:
                if (str.equals("TextView")) {
                    c4 = 3;
                    break;
                }
                break;
            case -937446323:
                if (str.equals("ImageButton")) {
                    c4 = 4;
                    break;
                }
                break;
            case -658531749:
                if (str.equals("SeekBar")) {
                    c4 = 5;
                    break;
                }
                break;
            case -339785223:
                if (str.equals("Spinner")) {
                    c4 = 6;
                    break;
                }
                break;
            case 776382189:
                if (str.equals("RadioButton")) {
                    c4 = 7;
                    break;
                }
                break;
            case 799298502:
                if (str.equals("ToggleButton")) {
                    c4 = '\b';
                    break;
                }
                break;
            case 1125864064:
                if (str.equals("ImageView")) {
                    c4 = '\t';
                    break;
                }
                break;
            case 1413872058:
                if (str.equals("AutoCompleteTextView")) {
                    c4 = '\n';
                    break;
                }
                break;
            case 1601505219:
                if (str.equals("CheckBox")) {
                    c4 = 11;
                    break;
                }
                break;
            case 1666676343:
                if (str.equals("EditText")) {
                    c4 = '\f';
                    break;
                }
                break;
            case 2001146706:
                if (str.equals("Button")) {
                    c4 = '\r';
                    break;
                }
                break;
        }
        switch (c4) {
            case 0:
                l4 = l(context2, attributeSet);
                v(l4, str);
                break;
            case 1:
                l4 = f(context2, attributeSet);
                v(l4, str);
                break;
            case 2:
                l4 = j(context2, attributeSet);
                v(l4, str);
                break;
            case 3:
                l4 = o(context2, attributeSet);
                v(l4, str);
                break;
            case 4:
                l4 = h(context2, attributeSet);
                v(l4, str);
                break;
            case 5:
                l4 = m(context2, attributeSet);
                v(l4, str);
                break;
            case 6:
                l4 = n(context2, attributeSet);
                v(l4, str);
                break;
            case 7:
                l4 = k(context2, attributeSet);
                v(l4, str);
                break;
            case '\b':
                l4 = p(context2, attributeSet);
                v(l4, str);
                break;
            case '\t':
                l4 = i(context2, attributeSet);
                v(l4, str);
                break;
            case '\n':
                l4 = c(context2, attributeSet);
                v(l4, str);
                break;
            case 11:
                l4 = e(context2, attributeSet);
                v(l4, str);
                break;
            case '\f':
                l4 = g(context2, attributeSet);
                v(l4, str);
                break;
            case '\r':
                l4 = d(context2, attributeSet);
                v(l4, str);
                break;
            default:
                l4 = q(context2, str, attributeSet);
                break;
        }
        if (l4 == null && context != context2) {
            l4 = t(context2, str, attributeSet);
        }
        if (l4 != null) {
            b(l4, attributeSet);
            a(context2, l4, attributeSet);
        }
        return l4;
    }
}

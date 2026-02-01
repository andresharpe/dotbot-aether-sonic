package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C0823k0;
import com.harman.sdk.message.GestureInfo;
import d.C2042a;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends LinearLayoutCompat implements androidx.appcompat.view.c {

    /* renamed from: g1, reason: collision with root package name */
    static final boolean f5781g1 = false;

    /* renamed from: h1, reason: collision with root package name */
    static final String f5782h1 = "SearchView";

    /* renamed from: i1, reason: collision with root package name */
    private static final String f5783i1 = "nm";

    /* renamed from: j1, reason: collision with root package name */
    static final o f5784j1;

    /* renamed from: A0, reason: collision with root package name */
    private final Intent f5785A0;

    /* renamed from: B0, reason: collision with root package name */
    private final Intent f5786B0;

    /* renamed from: C0, reason: collision with root package name */
    private final CharSequence f5787C0;

    /* renamed from: D0, reason: collision with root package name */
    private m f5788D0;

    /* renamed from: E0, reason: collision with root package name */
    private l f5789E0;

    /* renamed from: F0, reason: collision with root package name */
    View.OnFocusChangeListener f5790F0;

    /* renamed from: G0, reason: collision with root package name */
    private n f5791G0;

    /* renamed from: H0, reason: collision with root package name */
    private View.OnClickListener f5792H0;

    /* renamed from: I0, reason: collision with root package name */
    private boolean f5793I0;

    /* renamed from: J0, reason: collision with root package name */
    private boolean f5794J0;

    /* renamed from: K0, reason: collision with root package name */
    androidx.cursoradapter.widget.a f5795K0;

    /* renamed from: L0, reason: collision with root package name */
    private boolean f5796L0;

    /* renamed from: M0, reason: collision with root package name */
    private CharSequence f5797M0;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f5798N0;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f5799O0;

    /* renamed from: P0, reason: collision with root package name */
    private int f5800P0;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f5801Q0;

    /* renamed from: R0, reason: collision with root package name */
    private CharSequence f5802R0;

    /* renamed from: S0, reason: collision with root package name */
    private CharSequence f5803S0;

    /* renamed from: T0, reason: collision with root package name */
    private boolean f5804T0;

    /* renamed from: U0, reason: collision with root package name */
    private int f5805U0;

    /* renamed from: V0, reason: collision with root package name */
    SearchableInfo f5806V0;

    /* renamed from: W0, reason: collision with root package name */
    private Bundle f5807W0;

    /* renamed from: X0, reason: collision with root package name */
    private final Runnable f5808X0;

    /* renamed from: Y0, reason: collision with root package name */
    private Runnable f5809Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f5810Z0;

    /* renamed from: a1, reason: collision with root package name */
    private final View.OnClickListener f5811a1;

    /* renamed from: b1, reason: collision with root package name */
    View.OnKeyListener f5812b1;

    /* renamed from: c1, reason: collision with root package name */
    private final TextView.OnEditorActionListener f5813c1;

    /* renamed from: d1, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f5814d1;

    /* renamed from: e1, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f5815e1;

    /* renamed from: f1, reason: collision with root package name */
    private TextWatcher f5816f1;

    /* renamed from: i0, reason: collision with root package name */
    final SearchAutoComplete f5817i0;

    /* renamed from: j0, reason: collision with root package name */
    private final View f5818j0;

    /* renamed from: k0, reason: collision with root package name */
    private final View f5819k0;

    /* renamed from: l0, reason: collision with root package name */
    private final View f5820l0;

    /* renamed from: m0, reason: collision with root package name */
    final ImageView f5821m0;

    /* renamed from: n0, reason: collision with root package name */
    final ImageView f5822n0;

    /* renamed from: o0, reason: collision with root package name */
    final ImageView f5823o0;

    /* renamed from: p0, reason: collision with root package name */
    final ImageView f5824p0;

    /* renamed from: q0, reason: collision with root package name */
    private final View f5825q0;

    /* renamed from: r0, reason: collision with root package name */
    private q f5826r0;

    /* renamed from: s0, reason: collision with root package name */
    private Rect f5827s0;

    /* renamed from: t0, reason: collision with root package name */
    private Rect f5828t0;

    /* renamed from: u0, reason: collision with root package name */
    private int[] f5829u0;

    /* renamed from: v0, reason: collision with root package name */
    private int[] f5830v0;

    /* renamed from: w0, reason: collision with root package name */
    private final ImageView f5831w0;

    /* renamed from: x0, reason: collision with root package name */
    private final Drawable f5832x0;

    /* renamed from: y0, reason: collision with root package name */
    private final int f5833y0;

    /* renamed from: z0, reason: collision with root package name */
    private final int f5834z0;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends C0592e {

        /* renamed from: I, reason: collision with root package name */
        private int f5835I;

        /* renamed from: J, reason: collision with root package name */
        private SearchView f5836J;

        /* renamed from: K, reason: collision with root package name */
        private boolean f5837K;

        /* renamed from: L, reason: collision with root package name */
        final Runnable f5838L;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.e();
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i4 = configuration.screenWidthDp;
            int i5 = configuration.screenHeightDp;
            if (i4 >= 960 && i5 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i4 < 600) {
                if (i4 < 640 || i5 < 480) {
                    return GestureInfo.f48257q0;
                }
                return 192;
            }
            return 192;
        }

        void c() {
            if (Build.VERSION.SDK_INT >= 29) {
                k.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f5784j1.c(this);
        }

        boolean d() {
            if (TextUtils.getTrimmedLength(getText()) == 0) {
                return true;
            }
            return false;
        }

        void e() {
            if (this.f5837K) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f5837K = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            if (this.f5835I > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // androidx.appcompat.widget.C0592e, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f5837K) {
                removeCallbacks(this.f5838L);
                post(this.f5838L);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z3, int i4, Rect rect) {
            super.onFocusChanged(z3, i4, rect);
            this.f5836J.g0();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i4, KeyEvent keyEvent) {
            if (i4 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f5836J.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i4, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z3) {
            super.onWindowFocusChanged(z3);
            if (z3 && this.f5836J.hasFocus() && getVisibility() == 0) {
                this.f5837K = true;
                if (SearchView.R(getContext())) {
                    c();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z3) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z3) {
                this.f5837K = false;
                removeCallbacks(this.f5838L);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.f5837K = false;
                    removeCallbacks(this.f5838L);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.f5837K = true;
            }
        }

        void setSearchView(SearchView searchView) {
            this.f5836J = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i4) {
            super.setThreshold(i4);
            this.f5835I = i4;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C2042a.b.f49163S);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f5838L = new a();
            this.f5835I = getThreshold();
        }
    }

    /* loaded from: classes.dex */
    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
            SearchView.this.f0(charSequence);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SearchView.this.m0();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            androidx.cursoradapter.widget.a aVar = SearchView.this.f5795K0;
            if (aVar instanceof a0) {
                aVar.b(null);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements View.OnFocusChangeListener {
        d() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z3) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f5790F0;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z3);
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements View.OnLayoutChangeListener {
        e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            SearchView.this.F();
        }
    }

    /* loaded from: classes.dex */
    class f implements View.OnClickListener {
        f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f5821m0) {
                searchView.c0();
                return;
            }
            if (view == searchView.f5823o0) {
                searchView.Y();
                return;
            }
            if (view == searchView.f5822n0) {
                searchView.d0();
            } else if (view == searchView.f5824p0) {
                searchView.h0();
            } else if (view == searchView.f5817i0) {
                searchView.L();
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements View.OnKeyListener {
        g() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i4, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f5806V0 == null) {
                return false;
            }
            if (searchView.f5817i0.isPopupShowing() && SearchView.this.f5817i0.getListSelection() != -1) {
                return SearchView.this.e0(view, i4, keyEvent);
            }
            if (SearchView.this.f5817i0.d() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i4 != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.W(0, null, searchView2.f5817i0.getText().toString());
            return true;
        }
    }

    /* loaded from: classes.dex */
    class h implements TextView.OnEditorActionListener {
        h() {
        }

        @Override // android.widget.TextView.OnEditorActionListener
        public boolean onEditorAction(TextView textView, int i4, KeyEvent keyEvent) {
            SearchView.this.d0();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class i implements AdapterView.OnItemClickListener {
        i() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.Z(i4, 0, null);
        }
    }

    /* loaded from: classes.dex */
    class j implements AdapterView.OnItemSelectedListener {
        j() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i4, long j4) {
            SearchView.this.a0(i4);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.W(ConstraintLayout.b.a.f9571D)
    /* loaded from: classes.dex */
    public static class k {
        private k() {
        }

        @InterfaceC0577u
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @InterfaceC0577u
        static void b(SearchAutoComplete searchAutoComplete, int i4) {
            searchAutoComplete.setInputMethodMode(i4);
        }
    }

    /* loaded from: classes.dex */
    public interface l {
        boolean a();
    }

    /* loaded from: classes.dex */
    public interface m {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    /* loaded from: classes.dex */
    public interface n {
        boolean onSuggestionClick(int i4);

        boolean onSuggestionSelect(int i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class o {

        /* renamed from: a, reason: collision with root package name */
        private Method f5850a;

        /* renamed from: b, reason: collision with root package name */
        private Method f5851b;

        /* renamed from: c, reason: collision with root package name */
        private Method f5852c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        o() {
            this.f5850a = null;
            this.f5851b = null;
            this.f5852c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f5850a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f5851b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f5852c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT < 29) {
            } else {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f5851b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f5850a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f5852c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class p extends androidx.customview.view.a {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: G, reason: collision with root package name */
        boolean f5853G;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<p> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel) {
                return new p(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public p createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new p(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public p[] newArray(int i4) {
                return new p[i4];
            }
        }

        p(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f5853G + "}";
        }

        @Override // androidx.customview.view.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeValue(Boolean.valueOf(this.f5853G));
        }

        public p(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5853G = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    /* loaded from: classes.dex */
    private static class q extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        private final View f5854a;

        /* renamed from: b, reason: collision with root package name */
        private final Rect f5855b;

        /* renamed from: c, reason: collision with root package name */
        private final Rect f5856c;

        /* renamed from: d, reason: collision with root package name */
        private final Rect f5857d;

        /* renamed from: e, reason: collision with root package name */
        private final int f5858e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f5859f;

        public q(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f5858e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f5855b = new Rect();
            this.f5857d = new Rect();
            this.f5856c = new Rect();
            a(rect, rect2);
            this.f5854a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f5855b.set(rect);
            this.f5857d.set(rect);
            Rect rect3 = this.f5857d;
            int i4 = this.f5858e;
            rect3.inset(-i4, -i4);
            this.f5856c.set(rect2);
        }

        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z3;
            boolean z4;
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z5 = true;
            if (action != 0) {
                if (action != 1 && action != 2) {
                    if (action == 3) {
                        z4 = this.f5859f;
                        this.f5859f = false;
                    }
                    z3 = true;
                    z5 = false;
                } else {
                    z4 = this.f5859f;
                    if (z4 && !this.f5857d.contains(x3, y3)) {
                        z5 = z4;
                        z3 = false;
                    }
                }
                z5 = z4;
                z3 = true;
            } else {
                if (this.f5855b.contains(x3, y3)) {
                    this.f5859f = true;
                    z3 = true;
                }
                z3 = true;
                z5 = false;
            }
            if (!z5) {
                return false;
            }
            if (z3 && !this.f5856c.contains(x3, y3)) {
                motionEvent.setLocation(this.f5854a.getWidth() / 2, this.f5854a.getHeight() / 2);
            } else {
                Rect rect = this.f5856c;
                motionEvent.setLocation(x3 - rect.left, y3 - rect.top);
            }
            return this.f5854a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        o oVar;
        if (Build.VERSION.SDK_INT < 29) {
            oVar = new o();
        } else {
            oVar = null;
        }
        f5784j1 = oVar;
    }

    public SearchView(@androidx.annotation.N Context context) {
        this(context, null);
    }

    private Intent G(String str, Uri uri, String str2, String str3, int i4, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f5803S0);
        if (str3 != null) {
            intent.putExtra(D0.d.f55b, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f5807W0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i4 != 0) {
            intent.putExtra("action_key", i4);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f5806V0.getSearchActivity());
        return intent;
    }

    private Intent H(Cursor cursor, int i4, String str) {
        int i5;
        Uri parse;
        String u3;
        try {
            String u4 = a0.u(cursor, "suggest_intent_action");
            if (u4 == null) {
                u4 = this.f5806V0.getSuggestIntentAction();
            }
            if (u4 == null) {
                u4 = "android.intent.action.SEARCH";
            }
            String str2 = u4;
            String u5 = a0.u(cursor, "suggest_intent_data");
            if (u5 == null) {
                u5 = this.f5806V0.getSuggestIntentData();
            }
            if (u5 != null && (u3 = a0.u(cursor, "suggest_intent_data_id")) != null) {
                u5 = u5 + "/" + Uri.encode(u3);
            }
            if (u5 == null) {
                parse = null;
            } else {
                parse = Uri.parse(u5);
            }
            return G(str2, parse, a0.u(cursor, "suggest_intent_extra_data"), a0.u(cursor, "suggest_intent_query"), i4, str);
        } catch (RuntimeException e4) {
            try {
                i5 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i5 = -1;
            }
            Log.w(f5782h1, "Search suggestions cursor at row " + i5 + " returned exception.", e4);
            return null;
        }
    }

    private Intent I(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i4;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f5807W0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i4 = searchableInfo.getVoiceMaxResults();
        } else {
            i4 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i4);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    private Intent J(Intent intent, SearchableInfo searchableInfo) {
        String flattenToShortString;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            flattenToShortString = null;
        } else {
            flattenToShortString = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", flattenToShortString);
        return intent2;
    }

    private void K() {
        this.f5817i0.dismissDropDown();
    }

    private void M(View view, Rect rect) {
        view.getLocationInWindow(this.f5829u0);
        getLocationInWindow(this.f5830v0);
        int[] iArr = this.f5829u0;
        int i4 = iArr[1];
        int[] iArr2 = this.f5830v0;
        int i5 = i4 - iArr2[1];
        int i6 = iArr[0] - iArr2[0];
        rect.set(i6, i5, view.getWidth() + i6, view.getHeight() + i5);
    }

    private CharSequence N(CharSequence charSequence) {
        if (this.f5793I0 && this.f5832x0 != null) {
            int textSize = (int) (this.f5817i0.getTextSize() * 1.25d);
            this.f5832x0.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.f5832x0), 1, 2, 33);
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        return charSequence;
    }

    private boolean O() {
        Intent intent;
        SearchableInfo searchableInfo = this.f5806V0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f5806V0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f5785A0;
        } else if (this.f5806V0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f5786B0;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    static boolean R(Context context) {
        if (context.getResources().getConfiguration().orientation == 2) {
            return true;
        }
        return false;
    }

    private boolean T() {
        if ((this.f5796L0 || this.f5801Q0) && !Q()) {
            return true;
        }
        return false;
    }

    private void V(Intent intent) {
        if (intent == null) {
            return;
        }
        try {
            getContext().startActivity(intent);
        } catch (RuntimeException e4) {
            Log.e(f5782h1, "Failed launch activity: " + intent, e4);
        }
    }

    private boolean X(int i4, int i5, String str) {
        Cursor c4 = this.f5795K0.c();
        if (c4 != null && c4.moveToPosition(i4)) {
            V(H(c4, i5, str));
            return true;
        }
        return false;
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C2042a.e.f49454c0);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C2042a.e.f49456d0);
    }

    private void i0() {
        post(this.f5808X0);
    }

    private void j0(int i4) {
        Editable text = this.f5817i0.getText();
        Cursor c4 = this.f5795K0.c();
        if (c4 == null) {
            return;
        }
        if (c4.moveToPosition(i4)) {
            CharSequence a4 = this.f5795K0.a(c4);
            if (a4 != null) {
                setQuery(a4);
                return;
            } else {
                setQuery(text);
                return;
            }
        }
        setQuery(text);
    }

    private void l0() {
        int[] iArr;
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f5817i0.getText());
        int i4 = 0;
        if (!z4 && (!this.f5793I0 || this.f5804T0)) {
            z3 = false;
        }
        ImageView imageView = this.f5823o0;
        if (!z3) {
            i4 = 8;
        }
        imageView.setVisibility(i4);
        Drawable drawable = this.f5823o0.getDrawable();
        if (drawable != null) {
            if (z4) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    private void n0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f5817i0;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(N(queryHint));
    }

    private void o0() {
        this.f5817i0.setThreshold(this.f5806V0.getSuggestThreshold());
        this.f5817i0.setImeOptions(this.f5806V0.getImeOptions());
        int inputType = this.f5806V0.getInputType();
        int i4 = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f5806V0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f5817i0.setInputType(inputType);
        androidx.cursoradapter.widget.a aVar = this.f5795K0;
        if (aVar != null) {
            aVar.b(null);
        }
        if (this.f5806V0.getSuggestAuthority() != null) {
            a0 a0Var = new a0(getContext(), this, this.f5806V0, this.f5810Z0);
            this.f5795K0 = a0Var;
            this.f5817i0.setAdapter(a0Var);
            a0 a0Var2 = (a0) this.f5795K0;
            if (this.f5798N0) {
                i4 = 2;
            }
            a0Var2.E(i4);
        }
    }

    private void p0() {
        int i4;
        if (T() && (this.f5822n0.getVisibility() == 0 || this.f5824p0.getVisibility() == 0)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.f5820l0.setVisibility(i4);
    }

    private void q0(boolean z3) {
        int i4;
        if (this.f5796L0 && T() && hasFocus() && (z3 || !this.f5801Q0)) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        this.f5822n0.setVisibility(i4);
    }

    private void r0(boolean z3) {
        int i4;
        int i5;
        this.f5794J0 = z3;
        int i6 = 8;
        if (z3) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f5817i0.getText());
        this.f5821m0.setVisibility(i4);
        q0(!isEmpty);
        View view = this.f5818j0;
        if (z3) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        view.setVisibility(i5);
        if (this.f5831w0.getDrawable() != null && !this.f5793I0) {
            i6 = 0;
        }
        this.f5831w0.setVisibility(i6);
        l0();
        s0(isEmpty);
        p0();
    }

    private void s0(boolean z3) {
        int i4 = 8;
        if (this.f5801Q0 && !Q() && z3) {
            this.f5822n0.setVisibility(8);
            i4 = 0;
        }
        this.f5824p0.setVisibility(i4);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        this.f5817i0.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f5817i0;
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    void F() {
        int i4;
        int i5;
        if (this.f5825q0.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f5819k0.getPaddingLeft();
            Rect rect = new Rect();
            boolean b4 = q0.b(this);
            if (this.f5793I0) {
                i4 = resources.getDimensionPixelSize(C2042a.e.f49433P) + resources.getDimensionPixelSize(C2042a.e.f49435Q);
            } else {
                i4 = 0;
            }
            this.f5817i0.getDropDownBackground().getPadding(rect);
            if (b4) {
                i5 = -rect.left;
            } else {
                i5 = paddingLeft - (rect.left + i4);
            }
            this.f5817i0.setDropDownHorizontalOffset(i5);
            this.f5817i0.setDropDownWidth((((this.f5825q0.getWidth() + rect.left) + rect.right) + i4) - paddingLeft);
        }
    }

    void L() {
        if (Build.VERSION.SDK_INT >= 29) {
            k.a(this.f5817i0);
            return;
        }
        o oVar = f5784j1;
        oVar.b(this.f5817i0);
        oVar.a(this.f5817i0);
    }

    public boolean P() {
        return this.f5793I0;
    }

    public boolean Q() {
        return this.f5794J0;
    }

    public boolean S() {
        return this.f5798N0;
    }

    public boolean U() {
        return this.f5796L0;
    }

    void W(int i4, String str, String str2) {
        getContext().startActivity(G("android.intent.action.SEARCH", null, null, str2, i4, str));
    }

    void Y() {
        if (TextUtils.isEmpty(this.f5817i0.getText())) {
            if (this.f5793I0) {
                l lVar = this.f5789E0;
                if (lVar == null || !lVar.a()) {
                    clearFocus();
                    r0(true);
                    return;
                }
                return;
            }
            return;
        }
        this.f5817i0.setText("");
        this.f5817i0.requestFocus();
        this.f5817i0.setImeVisibility(true);
    }

    boolean Z(int i4, int i5, String str) {
        n nVar = this.f5791G0;
        if (nVar != null && nVar.onSuggestionClick(i4)) {
            return false;
        }
        X(i4, 0, null);
        this.f5817i0.setImeVisibility(false);
        K();
        return true;
    }

    boolean a0(int i4) {
        n nVar = this.f5791G0;
        if (nVar != null && nVar.onSuggestionSelect(i4)) {
            return false;
        }
        j0(i4);
        return true;
    }

    @Override // androidx.appcompat.view.c
    public void b() {
        if (this.f5804T0) {
            return;
        }
        this.f5804T0 = true;
        int imeOptions = this.f5817i0.getImeOptions();
        this.f5805U0 = imeOptions;
        this.f5817i0.setImeOptions(imeOptions | 33554432);
        this.f5817i0.setText("");
        setIconified(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b0(@androidx.annotation.P CharSequence charSequence) {
        setQuery(charSequence);
    }

    void c0() {
        r0(false);
        this.f5817i0.requestFocus();
        this.f5817i0.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f5792H0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f5799O0 = true;
        super.clearFocus();
        this.f5817i0.clearFocus();
        this.f5817i0.setImeVisibility(false);
        this.f5799O0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void d() {
        k0("", false);
        clearFocus();
        r0(true);
        this.f5817i0.setImeOptions(this.f5805U0);
        this.f5804T0 = false;
    }

    void d0() {
        Editable text = this.f5817i0.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            m mVar = this.f5788D0;
            if (mVar == null || !mVar.onQueryTextSubmit(text.toString())) {
                if (this.f5806V0 != null) {
                    W(0, null, text.toString());
                }
                this.f5817i0.setImeVisibility(false);
                K();
            }
        }
    }

    boolean e0(View view, int i4, KeyEvent keyEvent) {
        int length;
        if (this.f5806V0 != null && this.f5795K0 != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i4 != 66 && i4 != 84 && i4 != 61) {
                if (i4 != 21 && i4 != 22) {
                    if (i4 == 19) {
                        this.f5817i0.getListSelection();
                        return false;
                    }
                } else {
                    if (i4 == 21) {
                        length = 0;
                    } else {
                        length = this.f5817i0.length();
                    }
                    this.f5817i0.setSelection(length);
                    this.f5817i0.setListSelection(0);
                    this.f5817i0.clearListSelection();
                    this.f5817i0.c();
                    return true;
                }
            } else {
                return Z(this.f5817i0.getListSelection(), 0, null);
            }
        }
        return false;
    }

    void f0(CharSequence charSequence) {
        Editable text = this.f5817i0.getText();
        this.f5803S0 = text;
        boolean isEmpty = TextUtils.isEmpty(text);
        q0(!isEmpty);
        s0(isEmpty);
        l0();
        p0();
        if (this.f5788D0 != null && !TextUtils.equals(charSequence, this.f5802R0)) {
            this.f5788D0.onQueryTextChange(charSequence.toString());
        }
        this.f5802R0 = charSequence.toString();
    }

    void g0() {
        r0(Q());
        i0();
        if (this.f5817i0.hasFocus()) {
            L();
        }
    }

    public int getImeOptions() {
        return this.f5817i0.getImeOptions();
    }

    public int getInputType() {
        return this.f5817i0.getInputType();
    }

    public int getMaxWidth() {
        return this.f5800P0;
    }

    public CharSequence getQuery() {
        return this.f5817i0.getText();
    }

    @androidx.annotation.P
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f5797M0;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.f5806V0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.f5806V0.getHintId());
            }
            return this.f5787C0;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f5834z0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f5833y0;
    }

    public androidx.cursoradapter.widget.a getSuggestionsAdapter() {
        return this.f5795K0;
    }

    void h0() {
        SearchableInfo searchableInfo = this.f5806V0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                getContext().startActivity(J(this.f5785A0, searchableInfo));
            } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                getContext().startActivity(I(this.f5786B0, searchableInfo));
            }
        } catch (ActivityNotFoundException unused) {
            Log.w(f5782h1, "Could not find voice search activity");
        }
    }

    public void k0(CharSequence charSequence, boolean z3) {
        this.f5817i0.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f5817i0;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f5803S0 = charSequence;
        }
        if (z3 && !TextUtils.isEmpty(charSequence)) {
            d0();
        }
    }

    void m0() {
        int[] iArr;
        if (this.f5817i0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f5819k0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f5820l0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.f5808X0);
        post(this.f5809Y0);
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        if (z3) {
            M(this.f5817i0, this.f5827s0);
            Rect rect = this.f5828t0;
            Rect rect2 = this.f5827s0;
            rect.set(rect2.left, 0, rect2.right, i7 - i5);
            q qVar = this.f5826r0;
            if (qVar == null) {
                q qVar2 = new q(this.f5828t0, this.f5827s0, this.f5817i0);
                this.f5826r0 = qVar2;
                setTouchDelegate(qVar2);
                return;
            }
            qVar.a(this.f5828t0, this.f5827s0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        if (Q()) {
            super.onMeasure(i4, i5);
            return;
        }
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i6 = this.f5800P0) > 0) {
                    size = Math.min(i6, size);
                }
            } else {
                size = this.f5800P0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i7 = this.f5800P0;
            size = i7 > 0 ? Math.min(i7, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p pVar = (p) parcelable;
        super.onRestoreInstanceState(pVar.a());
        r0(pVar.f5853G);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        p pVar = new p(super.onSaveInstanceState());
        pVar.f5853G = Q();
        return pVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z3) {
        super.onWindowFocusChanged(z3);
        i0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i4, Rect rect) {
        if (this.f5799O0 || !isFocusable()) {
            return false;
        }
        if (!Q()) {
            boolean requestFocus = this.f5817i0.requestFocus(i4, rect);
            if (requestFocus) {
                r0(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i4, rect);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setAppSearchData(Bundle bundle) {
        this.f5807W0 = bundle;
    }

    public void setIconified(boolean z3) {
        if (z3) {
            Y();
        } else {
            c0();
        }
    }

    public void setIconifiedByDefault(boolean z3) {
        if (this.f5793I0 == z3) {
            return;
        }
        this.f5793I0 = z3;
        r0(z3);
        n0();
    }

    public void setImeOptions(int i4) {
        this.f5817i0.setImeOptions(i4);
    }

    public void setInputType(int i4) {
        this.f5817i0.setInputType(i4);
    }

    public void setMaxWidth(int i4) {
        this.f5800P0 = i4;
        requestLayout();
    }

    public void setOnCloseListener(l lVar) {
        this.f5789E0 = lVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f5790F0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(m mVar) {
        this.f5788D0 = mVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f5792H0 = onClickListener;
    }

    public void setOnSuggestionListener(n nVar) {
        this.f5791G0 = nVar;
    }

    public void setQueryHint(@androidx.annotation.P CharSequence charSequence) {
        this.f5797M0 = charSequence;
        n0();
    }

    public void setQueryRefinementEnabled(boolean z3) {
        int i4;
        this.f5798N0 = z3;
        androidx.cursoradapter.widget.a aVar = this.f5795K0;
        if (aVar instanceof a0) {
            a0 a0Var = (a0) aVar;
            if (z3) {
                i4 = 2;
            } else {
                i4 = 1;
            }
            a0Var.E(i4);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f5806V0 = searchableInfo;
        if (searchableInfo != null) {
            o0();
            n0();
        }
        boolean O3 = O();
        this.f5801Q0 = O3;
        if (O3) {
            this.f5817i0.setPrivateImeOptions(f5783i1);
        }
        r0(Q());
    }

    public void setSubmitButtonEnabled(boolean z3) {
        this.f5796L0 = z3;
        r0(Q());
    }

    public void setSuggestionsAdapter(androidx.cursoradapter.widget.a aVar) {
        this.f5795K0 = aVar;
        this.f5817i0.setAdapter(aVar);
    }

    public SearchView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49146N2);
    }

    public SearchView(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5827s0 = new Rect();
        this.f5828t0 = new Rect();
        this.f5829u0 = new int[2];
        this.f5830v0 = new int[2];
        this.f5808X0 = new b();
        this.f5809Y0 = new c();
        this.f5810Z0 = new WeakHashMap<>();
        f fVar = new f();
        this.f5811a1 = fVar;
        this.f5812b1 = new g();
        h hVar = new h();
        this.f5813c1 = hVar;
        i iVar = new i();
        this.f5814d1 = iVar;
        j jVar = new j();
        this.f5815e1 = jVar;
        this.f5816f1 = new a();
        g0 G3 = g0.G(context, attributeSet, C2042a.m.b5, i4, 0);
        C0823k0.z1(this, context, C2042a.m.b5, attributeSet, G3.B(), i4, 0);
        LayoutInflater.from(context).inflate(G3.u(C2042a.m.l5, C2042a.j.f49710z), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C2042a.g.f49625e0);
        this.f5817i0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f5818j0 = findViewById(C2042a.g.f49617a0);
        View findViewById = findViewById(C2042a.g.f49623d0);
        this.f5819k0 = findViewById;
        View findViewById2 = findViewById(C2042a.g.f49645o0);
        this.f5820l0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(C2042a.g.f49614Y);
        this.f5821m0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2042a.g.f49619b0);
        this.f5822n0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C2042a.g.f49615Z);
        this.f5823o0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C2042a.g.f49627f0);
        this.f5824p0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C2042a.g.f49621c0);
        this.f5831w0 = imageView5;
        C0823k0.I1(findViewById, G3.h(C2042a.m.m5));
        C0823k0.I1(findViewById2, G3.h(C2042a.m.q5));
        imageView.setImageDrawable(G3.h(C2042a.m.p5));
        imageView2.setImageDrawable(G3.h(C2042a.m.j5));
        imageView3.setImageDrawable(G3.h(C2042a.m.g5));
        imageView4.setImageDrawable(G3.h(C2042a.m.s5));
        imageView5.setImageDrawable(G3.h(C2042a.m.p5));
        this.f5832x0 = G3.h(C2042a.m.o5);
        k0.a(imageView, getResources().getString(C2042a.k.f49734v));
        this.f5833y0 = G3.u(C2042a.m.r5, C2042a.j.f49709y);
        this.f5834z0 = G3.u(C2042a.m.h5, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f5816f1);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f5812b1);
        searchAutoComplete.setOnFocusChangeListener(new d());
        setIconifiedByDefault(G3.a(C2042a.m.k5, true));
        int g4 = G3.g(C2042a.m.d5, -1);
        if (g4 != -1) {
            setMaxWidth(g4);
        }
        this.f5787C0 = G3.x(C2042a.m.i5);
        this.f5797M0 = G3.x(C2042a.m.n5);
        int o4 = G3.o(C2042a.m.f5, -1);
        if (o4 != -1) {
            setImeOptions(o4);
        }
        int o5 = G3.o(C2042a.m.e5, -1);
        if (o5 != -1) {
            setInputType(o5);
        }
        setFocusable(G3.a(C2042a.m.c5, true));
        G3.I();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f5785A0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f5786B0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f5825q0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new e());
        }
        r0(this.f5793I0);
        n0();
    }
}

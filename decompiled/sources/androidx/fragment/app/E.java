package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TabWidget;
import java.util.ArrayList;

@Deprecated
/* loaded from: classes.dex */
public class E extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: E, reason: collision with root package name */
    private final ArrayList<c> f14917E;

    /* renamed from: F, reason: collision with root package name */
    private FrameLayout f14918F;

    /* renamed from: G, reason: collision with root package name */
    private Context f14919G;

    /* renamed from: H, reason: collision with root package name */
    private FragmentManager f14920H;

    /* renamed from: I, reason: collision with root package name */
    private int f14921I;

    /* renamed from: J, reason: collision with root package name */
    private TabHost.OnTabChangeListener f14922J;

    /* renamed from: K, reason: collision with root package name */
    private c f14923K;

    /* renamed from: L, reason: collision with root package name */
    private boolean f14924L;

    /* loaded from: classes.dex */
    static class a implements TabHost.TabContentFactory {

        /* renamed from: a, reason: collision with root package name */
        private final Context f14925a;

        public a(Context context) {
            this.f14925a = context;
        }

        @Override // android.widget.TabHost.TabContentFactory
        public View createTabContent(String str) {
            View view = new View(this.f14925a);
            view.setMinimumWidth(0);
            view.setMinimumHeight(0);
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends View.BaseSavedState {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        String f14926E;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i4) {
                return new b[i4];
            }
        }

        b(Parcelable parcelable) {
            super(parcelable);
        }

        @androidx.annotation.N
        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f14926E + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeString(this.f14926E);
        }

        b(Parcel parcel) {
            super(parcel);
            this.f14926E = parcel.readString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @androidx.annotation.N
        final String f14927a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.N
        final Class<?> f14928b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.P
        final Bundle f14929c;

        /* renamed from: d, reason: collision with root package name */
        Fragment f14930d;

        c(@androidx.annotation.N String str, @androidx.annotation.N Class<?> cls, @androidx.annotation.P Bundle bundle) {
            this.f14927a = str;
            this.f14928b = cls;
            this.f14929c = bundle;
        }
    }

    @Deprecated
    public E(@androidx.annotation.N Context context) {
        super(context, null);
        this.f14917E = new ArrayList<>();
        f(context, null);
    }

    @androidx.annotation.P
    private F b(@androidx.annotation.P String str, @androidx.annotation.P F f4) {
        Fragment fragment;
        c e4 = e(str);
        if (this.f14923K != e4) {
            if (f4 == null) {
                f4 = this.f14920H.q();
            }
            c cVar = this.f14923K;
            if (cVar != null && (fragment = cVar.f14930d) != null) {
                f4.v(fragment);
            }
            if (e4 != null) {
                Fragment fragment2 = e4.f14930d;
                if (fragment2 == null) {
                    Fragment a4 = this.f14920H.C0().a(this.f14919G.getClassLoader(), e4.f14928b.getName());
                    e4.f14930d = a4;
                    a4.setArguments(e4.f14929c);
                    f4.g(this.f14921I, e4.f14930d, e4.f14927a);
                } else {
                    f4.p(fragment2);
                }
            }
            this.f14923K = e4;
        }
        return f4;
    }

    private void c() {
        if (this.f14918F == null) {
            FrameLayout frameLayout = (FrameLayout) findViewById(this.f14921I);
            this.f14918F = frameLayout;
            if (frameLayout == null) {
                throw new IllegalStateException("No tab content FrameLayout found for id " + this.f14921I);
            }
        }
    }

    private void d(Context context) {
        if (findViewById(R.id.tabs) == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
            TabWidget tabWidget = new TabWidget(context);
            tabWidget.setId(R.id.tabs);
            tabWidget.setOrientation(0);
            linearLayout.addView(tabWidget, new LinearLayout.LayoutParams(-1, -2, 0.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setId(R.id.tabcontent);
            linearLayout.addView(frameLayout, new LinearLayout.LayoutParams(0, 0, 0.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.f14918F = frameLayout2;
            frameLayout2.setId(this.f14921I);
            linearLayout.addView(frameLayout2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        }
    }

    @androidx.annotation.P
    private c e(String str) {
        int size = this.f14917E.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = this.f14917E.get(i4);
            if (cVar.f14927a.equals(str)) {
                return cVar;
            }
        }
        return null;
    }

    private void f(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.inflatedId}, 0, 0);
        this.f14921I = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    @Deprecated
    public void a(@androidx.annotation.N TabHost.TabSpec tabSpec, @androidx.annotation.N Class<?> cls, @androidx.annotation.P Bundle bundle) {
        tabSpec.setContent(new a(this.f14919G));
        String tag = tabSpec.getTag();
        c cVar = new c(tag, cls, bundle);
        if (this.f14924L) {
            Fragment o02 = this.f14920H.o0(tag);
            cVar.f14930d = o02;
            if (o02 != null && !o02.isDetached()) {
                F q4 = this.f14920H.q();
                q4.v(cVar.f14930d);
                q4.q();
            }
        }
        this.f14917E.add(cVar);
        addTab(tabSpec);
    }

    @Deprecated
    public void g(@androidx.annotation.N Context context, @androidx.annotation.N FragmentManager fragmentManager) {
        d(context);
        super.setup();
        this.f14919G = context;
        this.f14920H = fragmentManager;
        c();
    }

    @Deprecated
    public void h(@androidx.annotation.N Context context, @androidx.annotation.N FragmentManager fragmentManager, int i4) {
        d(context);
        super.setup();
        this.f14919G = context;
        this.f14920H = fragmentManager;
        this.f14921I = i4;
        c();
        this.f14918F.setId(i4);
        if (getId() == -1) {
            setId(R.id.tabhost);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        int size = this.f14917E.size();
        F f4 = null;
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = this.f14917E.get(i4);
            Fragment o02 = this.f14920H.o0(cVar.f14927a);
            cVar.f14930d = o02;
            if (o02 != null && !o02.isDetached()) {
                if (cVar.f14927a.equals(currentTabTag)) {
                    this.f14923K = cVar;
                } else {
                    if (f4 == null) {
                        f4 = this.f14920H.q();
                    }
                    f4.v(cVar.f14930d);
                }
            }
        }
        this.f14924L = true;
        F b4 = b(currentTabTag, f4);
        if (b4 != null) {
            b4.q();
            this.f14920H.j0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @Deprecated
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14924L = false;
    }

    @Override // android.view.View
    @Deprecated
    protected void onRestoreInstanceState(@SuppressLint({"UnknownNullness"}) Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.getSuperState());
        setCurrentTabByTag(bVar.f14926E);
    }

    @Override // android.view.View
    @androidx.annotation.N
    @Deprecated
    protected Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f14926E = getCurrentTabTag();
        return bVar;
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @Deprecated
    public void onTabChanged(@androidx.annotation.P String str) {
        F b4;
        if (this.f14924L && (b4 = b(str, null)) != null) {
            b4.q();
        }
        TabHost.OnTabChangeListener onTabChangeListener = this.f14922J;
        if (onTabChangeListener != null) {
            onTabChangeListener.onTabChanged(str);
        }
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setOnTabChangedListener(@androidx.annotation.P TabHost.OnTabChangeListener onTabChangeListener) {
        this.f14922J = onTabChangeListener;
    }

    @Override // android.widget.TabHost
    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    @Deprecated
    public E(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14917E = new ArrayList<>();
        f(context, attributeSet);
    }
}

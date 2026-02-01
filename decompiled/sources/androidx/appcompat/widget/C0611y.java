package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.InterfaceC0577u;
import androidx.annotation.InterfaceC0578v;
import androidx.annotation.RestrictTo;
import androidx.appcompat.app.DialogInterfaceC0586d;
import androidx.core.view.C0823k0;
import androidx.core.view.InterfaceC0814h0;
import d.C2042a;
import e.C2046a;

/* renamed from: androidx.appcompat.widget.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0611y extends Spinner implements InterfaceC0814h0 {

    /* renamed from: M, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    @androidx.annotation.e0
    private static final int[] f6330M = {R.attr.spinnerMode};

    /* renamed from: N, reason: collision with root package name */
    private static final int f6331N = 15;

    /* renamed from: O, reason: collision with root package name */
    private static final String f6332O = "AppCompatSpinner";

    /* renamed from: P, reason: collision with root package name */
    private static final int f6333P = 0;

    /* renamed from: Q, reason: collision with root package name */
    private static final int f6334Q = 1;

    /* renamed from: R, reason: collision with root package name */
    private static final int f6335R = -1;

    /* renamed from: E, reason: collision with root package name */
    private final C0593f f6336E;

    /* renamed from: F, reason: collision with root package name */
    private final Context f6337F;

    /* renamed from: G, reason: collision with root package name */
    private P f6338G;

    /* renamed from: H, reason: collision with root package name */
    private SpinnerAdapter f6339H;

    /* renamed from: I, reason: collision with root package name */
    private final boolean f6340I;

    /* renamed from: J, reason: collision with root package name */
    private j f6341J;

    /* renamed from: K, reason: collision with root package name */
    int f6342K;

    /* renamed from: L, reason: collision with root package name */
    final Rect f6343L;

    /* renamed from: androidx.appcompat.widget.y$a */
    /* loaded from: classes.dex */
    class a extends P {

        /* renamed from: N, reason: collision with root package name */
        final /* synthetic */ h f6344N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, h hVar) {
            super(view);
            this.f6344N = hVar;
        }

        @Override // androidx.appcompat.widget.P
        public androidx.appcompat.view.menu.q b() {
            return this.f6344N;
        }

        @Override // androidx.appcompat.widget.P
        @SuppressLint({"SyntheticAccessor"})
        public boolean c() {
            if (!C0611y.this.getInternalPopup().c()) {
                C0611y.this.b();
                return true;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!C0611y.this.getInternalPopup().c()) {
                C0611y.this.b();
            }
            ViewTreeObserver viewTreeObserver = C0611y.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                c.a(viewTreeObserver, this);
            }
        }
    }

    @androidx.annotation.W(16)
    /* renamed from: androidx.appcompat.widget.y$c */
    /* loaded from: classes.dex */
    private static final class c {
        private c() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N ViewTreeObserver viewTreeObserver, @androidx.annotation.P ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.annotation.W(17)
    /* renamed from: androidx.appcompat.widget.y$d */
    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        @InterfaceC0577u
        static int a(@androidx.annotation.N View view) {
            return view.getTextAlignment();
        }

        @InterfaceC0577u
        static int b(@androidx.annotation.N View view) {
            return view.getTextDirection();
        }

        @InterfaceC0577u
        static void c(@androidx.annotation.N View view, int i4) {
            view.setTextAlignment(i4);
        }

        @InterfaceC0577u
        static void d(@androidx.annotation.N View view, int i4) {
            view.setTextDirection(i4);
        }
    }

    @androidx.annotation.W(23)
    /* renamed from: androidx.appcompat.widget.y$e */
    /* loaded from: classes.dex */
    private static final class e {
        private e() {
        }

        @InterfaceC0577u
        static void a(@androidx.annotation.N ThemedSpinnerAdapter themedSpinnerAdapter, @androidx.annotation.P Resources.Theme theme) {
            if (!androidx.core.util.p.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    @androidx.annotation.i0
    /* renamed from: androidx.appcompat.widget.y$f */
    /* loaded from: classes.dex */
    class f implements j, DialogInterface.OnClickListener {

        /* renamed from: E, reason: collision with root package name */
        @androidx.annotation.i0
        DialogInterfaceC0586d f6347E;

        /* renamed from: F, reason: collision with root package name */
        private ListAdapter f6348F;

        /* renamed from: G, reason: collision with root package name */
        private CharSequence f6349G;

        f() {
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void b(Drawable drawable) {
            Log.e(C0611y.f6332O, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public boolean c() {
            DialogInterfaceC0586d dialogInterfaceC0586d = this.f6347E;
            if (dialogInterfaceC0586d != null) {
                return dialogInterfaceC0586d.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void dismiss() {
            DialogInterfaceC0586d dialogInterfaceC0586d = this.f6347E;
            if (dialogInterfaceC0586d != null) {
                dialogInterfaceC0586d.dismiss();
                this.f6347E = null;
            }
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void f(int i4) {
            Log.e(C0611y.f6332O, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public CharSequence g() {
            return this.f6349G;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public Drawable i() {
            return null;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void j(CharSequence charSequence) {
            this.f6349G = charSequence;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void l(int i4) {
            Log.e(C0611y.f6332O, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void m(int i4) {
            Log.e(C0611y.f6332O, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void n(int i4, int i5) {
            if (this.f6348F == null) {
                return;
            }
            DialogInterfaceC0586d.a aVar = new DialogInterfaceC0586d.a(C0611y.this.getPopupContext());
            CharSequence charSequence = this.f6349G;
            if (charSequence != null) {
                aVar.K(charSequence);
            }
            DialogInterfaceC0586d a4 = aVar.H(this.f6348F, C0611y.this.getSelectedItemPosition(), this).a();
            this.f6347E = a4;
            ListView o4 = a4.o();
            d.d(o4, i4);
            d.c(o4, i5);
            this.f6347E.show();
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public int o() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i4) {
            C0611y.this.setSelection(i4);
            if (C0611y.this.getOnItemClickListener() != null) {
                C0611y.this.performItemClick(null, i4, this.f6348F.getItemId(i4));
            }
            dismiss();
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public int p() {
            return 0;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void q(ListAdapter listAdapter) {
            this.f6348F = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.widget.y$g */
    /* loaded from: classes.dex */
    public static class g implements ListAdapter, SpinnerAdapter {

        /* renamed from: E, reason: collision with root package name */
        private SpinnerAdapter f6351E;

        /* renamed from: F, reason: collision with root package name */
        private ListAdapter f6352F;

        public g(@androidx.annotation.P SpinnerAdapter spinnerAdapter, @androidx.annotation.P Resources.Theme theme) {
            this.f6351E = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f6352F = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    e.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof c0) {
                    c0 c0Var = (c0) spinnerAdapter;
                    if (c0Var.getDropDownViewTheme() == null) {
                        c0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f6352F;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i4, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i4) {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i4);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i4);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i4) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            return getDropDownView(i4, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter != null && spinnerAdapter.hasStableIds()) {
                return true;
            }
            return false;
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            if (getCount() == 0) {
                return true;
            }
            return false;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i4) {
            ListAdapter listAdapter = this.f6352F;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i4);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f6351E;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    @androidx.annotation.i0
    /* renamed from: androidx.appcompat.widget.y$h */
    /* loaded from: classes.dex */
    class h extends Q implements j {

        /* renamed from: A0, reason: collision with root package name */
        private int f6353A0;

        /* renamed from: x0, reason: collision with root package name */
        private CharSequence f6355x0;

        /* renamed from: y0, reason: collision with root package name */
        ListAdapter f6356y0;

        /* renamed from: z0, reason: collision with root package name */
        private final Rect f6357z0;

        /* renamed from: androidx.appcompat.widget.y$h$a */
        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ C0611y f6358E;

            a(C0611y c0611y) {
                this.f6358E = c0611y;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                C0611y.this.setSelection(i4);
                if (C0611y.this.getOnItemClickListener() != null) {
                    h hVar = h.this;
                    C0611y.this.performItemClick(view, i4, hVar.f6356y0.getItemId(i4));
                }
                h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.y$h$b */
        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                h hVar = h.this;
                if (!hVar.r0(C0611y.this)) {
                    h.this.dismiss();
                } else {
                    h.this.q0();
                    h.super.a();
                }
            }
        }

        /* renamed from: androidx.appcompat.widget.y$h$c */
        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f6361E;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f6361E = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0611y.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f6361E);
                }
            }
        }

        public h(Context context, AttributeSet attributeSet, int i4) {
            super(context, attributeSet, i4);
            this.f6357z0 = new Rect();
            S(C0611y.this);
            d0(true);
            j0(0);
            f0(new a(C0611y.this));
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public CharSequence g() {
            return this.f6355x0;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void j(CharSequence charSequence) {
            this.f6355x0 = charSequence;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void m(int i4) {
            this.f6353A0 = i4;
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public void n(int i4, int i5) {
            ViewTreeObserver viewTreeObserver;
            boolean c4 = c();
            q0();
            a0(2);
            super.a();
            ListView k4 = k();
            k4.setChoiceMode(1);
            d.d(k4, i4);
            d.c(k4, i5);
            l0(C0611y.this.getSelectedItemPosition());
            if (!c4 && (viewTreeObserver = C0611y.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                e0(new c(bVar));
            }
        }

        @Override // androidx.appcompat.widget.C0611y.j
        public int p() {
            return this.f6353A0;
        }

        @Override // androidx.appcompat.widget.Q, androidx.appcompat.widget.C0611y.j
        public void q(ListAdapter listAdapter) {
            super.q(listAdapter);
            this.f6356y0 = listAdapter;
        }

        void q0() {
            int i4;
            int p4;
            Drawable i5 = i();
            if (i5 != null) {
                i5.getPadding(C0611y.this.f6343L);
                if (q0.b(C0611y.this)) {
                    i4 = C0611y.this.f6343L.right;
                } else {
                    i4 = -C0611y.this.f6343L.left;
                }
            } else {
                Rect rect = C0611y.this.f6343L;
                rect.right = 0;
                rect.left = 0;
                i4 = 0;
            }
            int paddingLeft = C0611y.this.getPaddingLeft();
            int paddingRight = C0611y.this.getPaddingRight();
            int width = C0611y.this.getWidth();
            C0611y c0611y = C0611y.this;
            int i6 = c0611y.f6342K;
            if (i6 == -2) {
                int a4 = c0611y.a((SpinnerAdapter) this.f6356y0, i());
                int i7 = C0611y.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = C0611y.this.f6343L;
                int i8 = (i7 - rect2.left) - rect2.right;
                if (a4 > i8) {
                    a4 = i8;
                }
                U(Math.max(a4, (width - paddingLeft) - paddingRight));
            } else if (i6 == -1) {
                U((width - paddingLeft) - paddingRight);
            } else {
                U(i6);
            }
            if (q0.b(C0611y.this)) {
                p4 = i4 + (((width - paddingRight) - H()) - p());
            } else {
                p4 = i4 + paddingLeft + p();
            }
            f(p4);
        }

        boolean r0(View view) {
            if (C0823k0.O0(view) && view.getGlobalVisibleRect(this.f6357z0)) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.widget.y$i */
    /* loaded from: classes.dex */
    public static class i extends View.BaseSavedState {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: E, reason: collision with root package name */
        boolean f6363E;

        /* renamed from: androidx.appcompat.widget.y$i$a */
        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<i> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i4) {
                return new i[i4];
            }
        }

        i(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeByte(this.f6363E ? (byte) 1 : (byte) 0);
        }

        i(Parcel parcel) {
            super(parcel);
            this.f6363E = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @androidx.annotation.i0
    /* renamed from: androidx.appcompat.widget.y$j */
    /* loaded from: classes.dex */
    public interface j {
        void b(Drawable drawable);

        boolean c();

        int d();

        void dismiss();

        void f(int i4);

        CharSequence g();

        Drawable i();

        void j(CharSequence charSequence);

        void l(int i4);

        void m(int i4);

        void n(int i4, int i5);

        int o();

        int p();

        void q(ListAdapter listAdapter);
    }

    public C0611y(@androidx.annotation.N Context context) {
        this(context, (AttributeSet) null);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i4 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i5 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i4) {
                view = null;
                i4 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i5 = Math.max(i5, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.f6343L);
            Rect rect = this.f6343L;
            return i5 + rect.left + rect.right;
        }
        return i5;
    }

    void b() {
        this.f6341J.n(d.b(this), d.a(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            c0593f.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        j jVar = this.f6341J;
        if (jVar != null) {
            return jVar.d();
        }
        return super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        j jVar = this.f6341J;
        if (jVar != null) {
            return jVar.o();
        }
        return super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.f6341J != null) {
            return this.f6342K;
        }
        return super.getDropDownWidth();
    }

    @androidx.annotation.i0
    final j getInternalPopup() {
        return this.f6341J;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        j jVar = this.f6341J;
        if (jVar != null) {
            return jVar.i();
        }
        return super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f6337F;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        j jVar = this.f6341J;
        if (jVar != null) {
            return jVar.g();
        }
        return super.getPrompt();
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            return c0593f.c();
        }
        return null;
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @androidx.annotation.P
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            return c0593f.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f6341J;
        if (jVar != null && jVar.c()) {
            this.f6341J.dismiss();
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f6341J != null && View.MeasureSpec.getMode(i4) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i4)), getMeasuredHeight());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        if (iVar.f6363E && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new b());
        }
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z3;
        i iVar = new i(super.onSaveInstanceState());
        j jVar = this.f6341J;
        if (jVar != null && jVar.c()) {
            z3 = true;
        } else {
            z3 = false;
        }
        iVar.f6363E = z3;
        return iVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        P p4 = this.f6338G;
        if (p4 != null && p4.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        j jVar = this.f6341J;
        if (jVar != null) {
            if (!jVar.c()) {
                b();
                return true;
            }
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.P Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            c0593f.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@InterfaceC0578v int i4) {
        super.setBackgroundResource(i4);
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            c0593f.g(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i4) {
        j jVar = this.f6341J;
        if (jVar != null) {
            jVar.m(i4);
            this.f6341J.f(i4);
        } else {
            super.setDropDownHorizontalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i4) {
        j jVar = this.f6341J;
        if (jVar != null) {
            jVar.l(i4);
        } else {
            super.setDropDownVerticalOffset(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i4) {
        if (this.f6341J != null) {
            this.f6342K = i4;
        } else {
            super.setDropDownWidth(i4);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        j jVar = this.f6341J;
        if (jVar != null) {
            jVar.b(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(@InterfaceC0578v int i4) {
        setPopupBackgroundDrawable(C2046a.b(getPopupContext(), i4));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        j jVar = this.f6341J;
        if (jVar != null) {
            jVar.j(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.P ColorStateList colorStateList) {
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            c0593f.i(colorStateList);
        }
    }

    @Override // androidx.core.view.InterfaceC0814h0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.P PorterDuff.Mode mode) {
        C0593f c0593f = this.f6336E;
        if (c0593f != null) {
            c0593f.j(mode);
        }
    }

    public C0611y(@androidx.annotation.N Context context, int i4) {
        this(context, null, C2042a.b.f49190Y2, i4);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f6340I) {
            this.f6339H = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f6341J != null) {
            Context context = this.f6337F;
            if (context == null) {
                context = getContext();
            }
            this.f6341J.q(new g(spinnerAdapter, context.getTheme()));
        }
    }

    public C0611y(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet) {
        this(context, attributeSet, C2042a.b.f49190Y2);
    }

    public C0611y(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, -1);
    }

    public C0611y(@androidx.annotation.N Context context, @androidx.annotation.P AttributeSet attributeSet, int i4, int i5) {
        this(context, attributeSet, i4, i5, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0064, code lost:
    
        if (r11 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.y] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0611y(@androidx.annotation.N android.content.Context r7, @androidx.annotation.P android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0611y.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

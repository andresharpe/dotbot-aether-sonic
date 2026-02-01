package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.annotation.P;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.C0823k0;
import androidx.core.widget.NestedScrollView;
import d.C2042a;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A, reason: collision with root package name */
    NestedScrollView f4600A;

    /* renamed from: C, reason: collision with root package name */
    private Drawable f4602C;

    /* renamed from: D, reason: collision with root package name */
    private ImageView f4603D;

    /* renamed from: E, reason: collision with root package name */
    private TextView f4604E;

    /* renamed from: F, reason: collision with root package name */
    private TextView f4605F;

    /* renamed from: G, reason: collision with root package name */
    private View f4606G;

    /* renamed from: H, reason: collision with root package name */
    ListAdapter f4607H;

    /* renamed from: J, reason: collision with root package name */
    private int f4609J;

    /* renamed from: K, reason: collision with root package name */
    private int f4610K;

    /* renamed from: L, reason: collision with root package name */
    int f4611L;

    /* renamed from: M, reason: collision with root package name */
    int f4612M;

    /* renamed from: N, reason: collision with root package name */
    int f4613N;

    /* renamed from: O, reason: collision with root package name */
    int f4614O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f4615P;

    /* renamed from: R, reason: collision with root package name */
    Handler f4617R;

    /* renamed from: a, reason: collision with root package name */
    private final Context f4619a;

    /* renamed from: b, reason: collision with root package name */
    final t f4620b;

    /* renamed from: c, reason: collision with root package name */
    private final Window f4621c;

    /* renamed from: d, reason: collision with root package name */
    private final int f4622d;

    /* renamed from: e, reason: collision with root package name */
    private CharSequence f4623e;

    /* renamed from: f, reason: collision with root package name */
    private CharSequence f4624f;

    /* renamed from: g, reason: collision with root package name */
    ListView f4625g;

    /* renamed from: h, reason: collision with root package name */
    private View f4626h;

    /* renamed from: i, reason: collision with root package name */
    private int f4627i;

    /* renamed from: j, reason: collision with root package name */
    private int f4628j;

    /* renamed from: k, reason: collision with root package name */
    private int f4629k;

    /* renamed from: l, reason: collision with root package name */
    private int f4630l;

    /* renamed from: m, reason: collision with root package name */
    private int f4631m;

    /* renamed from: o, reason: collision with root package name */
    Button f4633o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f4634p;

    /* renamed from: q, reason: collision with root package name */
    Message f4635q;

    /* renamed from: r, reason: collision with root package name */
    private Drawable f4636r;

    /* renamed from: s, reason: collision with root package name */
    Button f4637s;

    /* renamed from: t, reason: collision with root package name */
    private CharSequence f4638t;

    /* renamed from: u, reason: collision with root package name */
    Message f4639u;

    /* renamed from: v, reason: collision with root package name */
    private Drawable f4640v;

    /* renamed from: w, reason: collision with root package name */
    Button f4641w;

    /* renamed from: x, reason: collision with root package name */
    private CharSequence f4642x;

    /* renamed from: y, reason: collision with root package name */
    Message f4643y;

    /* renamed from: z, reason: collision with root package name */
    private Drawable f4644z;

    /* renamed from: n, reason: collision with root package name */
    private boolean f4632n = false;

    /* renamed from: B, reason: collision with root package name */
    private int f4601B = 0;

    /* renamed from: I, reason: collision with root package name */
    int f4608I = -1;

    /* renamed from: Q, reason: collision with root package name */
    private int f4616Q = 0;

    /* renamed from: S, reason: collision with root package name */
    private final View.OnClickListener f4618S = new a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: E, reason: collision with root package name */
        private final int f4645E;

        /* renamed from: F, reason: collision with root package name */
        private final int f4646F;

        public RecycleListView(Context context) {
            this(context, null);
        }

        public void a(boolean z3, boolean z4) {
            int i4;
            int i5;
            if (!z4 || !z3) {
                int paddingLeft = getPaddingLeft();
                if (z3) {
                    i4 = getPaddingTop();
                } else {
                    i4 = this.f4645E;
                }
                int paddingRight = getPaddingRight();
                if (z4) {
                    i5 = getPaddingBottom();
                } else {
                    i5 = this.f4646F;
                }
                setPadding(paddingLeft, i4, paddingRight, i5);
            }
        }

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2042a.m.Y4);
            this.f4646F = obtainStyledAttributes.getDimensionPixelOffset(C2042a.m.Z4, -1);
            this.f4645E = obtainStyledAttributes.getDimensionPixelOffset(C2042a.m.a5, -1);
        }
    }

    /* loaded from: classes.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f4633o && (message4 = alertController.f4635q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f4637s && (message3 = alertController.f4639u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f4641w && (message2 = alertController.f4643y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f4617R.obtainMessage(1, alertController2.f4620b).sendToTarget();
        }
    }

    /* loaded from: classes.dex */
    class b implements NestedScrollView.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4648a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4649b;

        b(View view, View view2) {
            this.f4648a = view;
            this.f4649b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.c
        public void a(NestedScrollView nestedScrollView, int i4, int i5, int i6, int i7) {
            AlertController.g(nestedScrollView, this.f4648a, this.f4649b);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f4651E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f4652F;

        c(View view, View view2) {
            this.f4651E = view;
            this.f4652F = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f4600A, this.f4651E, this.f4652F);
        }
    }

    /* loaded from: classes.dex */
    class d implements AbsListView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f4654a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f4655b;

        d(View view, View view2) {
            this.f4654a = view;
            this.f4655b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
            AlertController.g(absListView, this.f4654a, this.f4655b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f4657E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ View f4658F;

        e(View view, View view2) {
            this.f4657E = view;
            this.f4658F = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.g(AlertController.this.f4625g, this.f4657E, this.f4658F);
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: A, reason: collision with root package name */
        public int f4660A;

        /* renamed from: B, reason: collision with root package name */
        public int f4661B;

        /* renamed from: C, reason: collision with root package name */
        public int f4662C;

        /* renamed from: D, reason: collision with root package name */
        public int f4663D;

        /* renamed from: F, reason: collision with root package name */
        public boolean[] f4665F;

        /* renamed from: G, reason: collision with root package name */
        public boolean f4666G;

        /* renamed from: H, reason: collision with root package name */
        public boolean f4667H;

        /* renamed from: J, reason: collision with root package name */
        public DialogInterface.OnMultiChoiceClickListener f4669J;

        /* renamed from: K, reason: collision with root package name */
        public Cursor f4670K;

        /* renamed from: L, reason: collision with root package name */
        public String f4671L;

        /* renamed from: M, reason: collision with root package name */
        public String f4672M;

        /* renamed from: N, reason: collision with root package name */
        public boolean f4673N;

        /* renamed from: O, reason: collision with root package name */
        public AdapterView.OnItemSelectedListener f4674O;

        /* renamed from: P, reason: collision with root package name */
        public e f4675P;

        /* renamed from: a, reason: collision with root package name */
        public final Context f4677a;

        /* renamed from: b, reason: collision with root package name */
        public final LayoutInflater f4678b;

        /* renamed from: d, reason: collision with root package name */
        public Drawable f4680d;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f4682f;

        /* renamed from: g, reason: collision with root package name */
        public View f4683g;

        /* renamed from: h, reason: collision with root package name */
        public CharSequence f4684h;

        /* renamed from: i, reason: collision with root package name */
        public CharSequence f4685i;

        /* renamed from: j, reason: collision with root package name */
        public Drawable f4686j;

        /* renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f4687k;

        /* renamed from: l, reason: collision with root package name */
        public CharSequence f4688l;

        /* renamed from: m, reason: collision with root package name */
        public Drawable f4689m;

        /* renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f4690n;

        /* renamed from: o, reason: collision with root package name */
        public CharSequence f4691o;

        /* renamed from: p, reason: collision with root package name */
        public Drawable f4692p;

        /* renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f4693q;

        /* renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f4695s;

        /* renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f4696t;

        /* renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f4697u;

        /* renamed from: v, reason: collision with root package name */
        public CharSequence[] f4698v;

        /* renamed from: w, reason: collision with root package name */
        public ListAdapter f4699w;

        /* renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f4700x;

        /* renamed from: y, reason: collision with root package name */
        public int f4701y;

        /* renamed from: z, reason: collision with root package name */
        public View f4702z;

        /* renamed from: c, reason: collision with root package name */
        public int f4679c = 0;

        /* renamed from: e, reason: collision with root package name */
        public int f4681e = 0;

        /* renamed from: E, reason: collision with root package name */
        public boolean f4664E = false;

        /* renamed from: I, reason: collision with root package name */
        public int f4668I = -1;

        /* renamed from: Q, reason: collision with root package name */
        public boolean f4676Q = true;

        /* renamed from: r, reason: collision with root package name */
        public boolean f4694r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter<CharSequence> {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ RecycleListView f4703E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i4, int i5, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i4, i5, charSequenceArr);
                this.f4703E = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i4, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i4, view, viewGroup);
                boolean[] zArr = f.this.f4665F;
                if (zArr != null && zArr[i4]) {
                    this.f4703E.setItemChecked(i4, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: E, reason: collision with root package name */
            private final int f4705E;

            /* renamed from: F, reason: collision with root package name */
            private final int f4706F;

            /* renamed from: G, reason: collision with root package name */
            final /* synthetic */ RecycleListView f4707G;

            /* renamed from: H, reason: collision with root package name */
            final /* synthetic */ AlertController f4708H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z3, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z3);
                this.f4707G = recycleListView;
                this.f4708H = alertController;
                Cursor cursor2 = getCursor();
                this.f4705E = cursor2.getColumnIndexOrThrow(f.this.f4671L);
                this.f4706F = cursor2.getColumnIndexOrThrow(f.this.f4672M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f4705E));
                RecycleListView recycleListView = this.f4707G;
                int position = cursor.getPosition();
                boolean z3 = true;
                if (cursor.getInt(this.f4706F) != 1) {
                    z3 = false;
                }
                recycleListView.setItemChecked(position, z3);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return f.this.f4678b.inflate(this.f4708H.f4612M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ AlertController f4710E;

            c(AlertController alertController) {
                this.f4710E = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                f.this.f4700x.onClick(this.f4710E.f4620b, i4);
                if (!f.this.f4667H) {
                    this.f4710E.f4620b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: E, reason: collision with root package name */
            final /* synthetic */ RecycleListView f4712E;

            /* renamed from: F, reason: collision with root package name */
            final /* synthetic */ AlertController f4713F;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f4712E = recycleListView;
                this.f4713F = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
                boolean[] zArr = f.this.f4665F;
                if (zArr != null) {
                    zArr[i4] = this.f4712E.isItemChecked(i4);
                }
                f.this.f4669J.onClick(this.f4713F.f4620b, i4, this.f4712E.isItemChecked(i4));
            }
        }

        /* loaded from: classes.dex */
        public interface e {
            void a(ListView listView);
        }

        public f(Context context) {
            this.f4677a = context;
            this.f4678b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            int i4;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f4678b.inflate(alertController.f4611L, (ViewGroup) null);
            if (this.f4666G) {
                if (this.f4670K == null) {
                    listAdapter = new a(this.f4677a, alertController.f4612M, R.id.text1, this.f4698v, recycleListView);
                } else {
                    listAdapter = new b(this.f4677a, this.f4670K, false, recycleListView, alertController);
                }
            } else {
                if (this.f4667H) {
                    i4 = alertController.f4613N;
                } else {
                    i4 = alertController.f4614O;
                }
                int i5 = i4;
                if (this.f4670K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f4677a, i5, this.f4670K, new String[]{this.f4671L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f4699w;
                    if (listAdapter == null) {
                        listAdapter = new h(this.f4677a, i5, R.id.text1, this.f4698v);
                    }
                }
            }
            e eVar = this.f4675P;
            if (eVar != null) {
                eVar.a(recycleListView);
            }
            alertController.f4607H = listAdapter;
            alertController.f4608I = this.f4668I;
            if (this.f4700x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f4669J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f4674O;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f4667H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f4666G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f4625g = recycleListView;
        }

        public void a(AlertController alertController) {
            View view = this.f4683g;
            if (view != null) {
                alertController.n(view);
            } else {
                CharSequence charSequence = this.f4682f;
                if (charSequence != null) {
                    alertController.s(charSequence);
                }
                Drawable drawable = this.f4680d;
                if (drawable != null) {
                    alertController.p(drawable);
                }
                int i4 = this.f4679c;
                if (i4 != 0) {
                    alertController.o(i4);
                }
                int i5 = this.f4681e;
                if (i5 != 0) {
                    alertController.o(alertController.d(i5));
                }
            }
            CharSequence charSequence2 = this.f4684h;
            if (charSequence2 != null) {
                alertController.q(charSequence2);
            }
            CharSequence charSequence3 = this.f4685i;
            if (charSequence3 != null || this.f4686j != null) {
                alertController.l(-1, charSequence3, this.f4687k, null, this.f4686j);
            }
            CharSequence charSequence4 = this.f4688l;
            if (charSequence4 != null || this.f4689m != null) {
                alertController.l(-2, charSequence4, this.f4690n, null, this.f4689m);
            }
            CharSequence charSequence5 = this.f4691o;
            if (charSequence5 != null || this.f4692p != null) {
                alertController.l(-3, charSequence5, this.f4693q, null, this.f4692p);
            }
            if (this.f4698v != null || this.f4670K != null || this.f4699w != null) {
                b(alertController);
            }
            View view2 = this.f4702z;
            if (view2 != null) {
                if (this.f4664E) {
                    alertController.v(view2, this.f4660A, this.f4661B, this.f4662C, this.f4663D);
                    return;
                } else {
                    alertController.u(view2);
                    return;
                }
            }
            int i6 = this.f4701y;
            if (i6 != 0) {
                alertController.t(i6);
            }
        }
    }

    /* loaded from: classes.dex */
    private static final class g extends Handler {

        /* renamed from: b, reason: collision with root package name */
        private static final int f4715b = 1;

        /* renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f4716a;

        public g(DialogInterface dialogInterface) {
            this.f4716a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i4 = message.what;
            if (i4 != -3 && i4 != -2 && i4 != -1) {
                if (i4 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick(this.f4716a.get(), message.what);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends ArrayAdapter<CharSequence> {
        public h(Context context, int i4, int i5, CharSequence[] charSequenceArr) {
            super(context, i4, i5, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, t tVar, Window window) {
        this.f4619a = context;
        this.f4620b = tVar;
        this.f4621c = window;
        this.f4617R = new g(tVar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, C2042a.m.f50042T, C2042a.b.f49139M, 0);
        this.f4609J = obtainStyledAttributes.getResourceId(C2042a.m.f50046U, 0);
        this.f4610K = obtainStyledAttributes.getResourceId(C2042a.m.f50054W, 0);
        this.f4611L = obtainStyledAttributes.getResourceId(C2042a.m.f50062Y, 0);
        this.f4612M = obtainStyledAttributes.getResourceId(C2042a.m.f50066Z, 0);
        this.f4613N = obtainStyledAttributes.getResourceId(C2042a.m.f50076b0, 0);
        this.f4614O = obtainStyledAttributes.getResourceId(C2042a.m.f50058X, 0);
        this.f4615P = obtainStyledAttributes.getBoolean(C2042a.m.f50071a0, true);
        this.f4622d = obtainStyledAttributes.getDimensionPixelSize(C2042a.m.f50050V, 0);
        obtainStyledAttributes.recycle();
        tVar.m(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A() {
        boolean z3;
        boolean z4;
        boolean z5;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f4621c.findViewById(C2042a.g.f49604O);
        View findViewById5 = findViewById4.findViewById(C2042a.g.f49659v0);
        View findViewById6 = findViewById4.findViewById(C2042a.g.f49656u);
        View findViewById7 = findViewById4.findViewById(C2042a.g.f49648q);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(C2042a.g.f49660w);
        y(viewGroup);
        View findViewById8 = viewGroup.findViewById(C2042a.g.f49659v0);
        View findViewById9 = viewGroup.findViewById(C2042a.g.f49656u);
        View findViewById10 = viewGroup.findViewById(C2042a.g.f49648q);
        ViewGroup j4 = j(findViewById8, findViewById5);
        ViewGroup j5 = j(findViewById9, findViewById6);
        ViewGroup j6 = j(findViewById10, findViewById7);
        x(j5);
        w(j6);
        z(j4);
        int i4 = 0;
        if (viewGroup.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (j4 != null && j4.getVisibility() != 8) {
            z4 = 1;
        } else {
            z4 = 0;
        }
        if (j6 != null && j6.getVisibility() != 8) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z5 && j5 != null && (findViewById3 = j5.findViewById(C2042a.g.f49649q0)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z4 != 0) {
            NestedScrollView nestedScrollView = this.f4600A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f4624f == null && this.f4625g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = j4.findViewById(C2042a.g.f49655t0);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (j5 != null && (findViewById = j5.findViewById(C2042a.g.f49651r0)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f4625g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z4, z5);
        }
        if (!z3) {
            View view = this.f4625g;
            if (view == null) {
                view = this.f4600A;
            }
            if (view != null) {
                if (z5) {
                    i4 = 2;
                }
                r(j5, view, z4 | i4, 3);
            }
        }
        ListView listView2 = this.f4625g;
        if (listView2 != null && (listAdapter = this.f4607H) != null) {
            listView2.setAdapter(listAdapter);
            int i5 = this.f4608I;
            if (i5 > -1) {
                listView2.setItemChecked(i5, true);
                listView2.setSelection(i5);
            }
        }
    }

    private static boolean B(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C2042a.b.f49135L, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    static void g(View view, View view2, View view3) {
        int i4;
        int i5 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i4 = 0;
            } else {
                i4 = 4;
            }
            view2.setVisibility(i4);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i5 = 0;
            }
            view3.setVisibility(i5);
        }
    }

    @P
    private ViewGroup j(@P View view, @P View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int k() {
        int i4 = this.f4610K;
        if (i4 == 0) {
            return this.f4609J;
        }
        if (this.f4616Q == 1) {
            return i4;
        }
        return this.f4609J;
    }

    private void r(ViewGroup viewGroup, View view, int i4, int i5) {
        View findViewById = this.f4621c.findViewById(C2042a.g.f49610U);
        View findViewById2 = this.f4621c.findViewById(C2042a.g.f49609T);
        C0823k0.p2(view, i4, i5);
        if (findViewById != null) {
            viewGroup.removeView(findViewById);
        }
        if (findViewById2 != null) {
            viewGroup.removeView(findViewById2);
        }
    }

    private void w(ViewGroup viewGroup) {
        int i4;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f4633o = button;
        button.setOnClickListener(this.f4618S);
        if (TextUtils.isEmpty(this.f4634p) && this.f4636r == null) {
            this.f4633o.setVisibility(8);
            i4 = 0;
        } else {
            this.f4633o.setText(this.f4634p);
            Drawable drawable = this.f4636r;
            if (drawable != null) {
                int i5 = this.f4622d;
                drawable.setBounds(0, 0, i5, i5);
                this.f4633o.setCompoundDrawables(this.f4636r, null, null, null);
            }
            this.f4633o.setVisibility(0);
            i4 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f4637s = button2;
        button2.setOnClickListener(this.f4618S);
        if (TextUtils.isEmpty(this.f4638t) && this.f4640v == null) {
            this.f4637s.setVisibility(8);
        } else {
            this.f4637s.setText(this.f4638t);
            Drawable drawable2 = this.f4640v;
            if (drawable2 != null) {
                int i6 = this.f4622d;
                drawable2.setBounds(0, 0, i6, i6);
                this.f4637s.setCompoundDrawables(this.f4640v, null, null, null);
            }
            this.f4637s.setVisibility(0);
            i4 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f4641w = button3;
        button3.setOnClickListener(this.f4618S);
        if (TextUtils.isEmpty(this.f4642x) && this.f4644z == null) {
            this.f4641w.setVisibility(8);
        } else {
            this.f4641w.setText(this.f4642x);
            Drawable drawable3 = this.f4644z;
            if (drawable3 != null) {
                int i7 = this.f4622d;
                drawable3.setBounds(0, 0, i7, i7);
                this.f4641w.setCompoundDrawables(this.f4644z, null, null, null);
            }
            this.f4641w.setVisibility(0);
            i4 |= 4;
        }
        if (B(this.f4619a)) {
            if (i4 == 1) {
                b(this.f4633o);
            } else if (i4 == 2) {
                b(this.f4637s);
            } else if (i4 == 4) {
                b(this.f4641w);
            }
        }
        if (i4 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void x(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f4621c.findViewById(C2042a.g.f49611V);
        this.f4600A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f4600A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f4605F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f4624f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f4600A.removeView(this.f4605F);
        if (this.f4625g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f4600A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f4600A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f4625g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void y(ViewGroup viewGroup) {
        View view = this.f4626h;
        boolean z3 = false;
        if (view == null) {
            if (this.f4627i != 0) {
                view = LayoutInflater.from(this.f4619a).inflate(this.f4627i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z3 = true;
        }
        if (!z3 || !a(view)) {
            this.f4621c.setFlags(131072, 131072);
        }
        if (z3) {
            FrameLayout frameLayout = (FrameLayout) this.f4621c.findViewById(C2042a.g.f49658v);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f4632n) {
                frameLayout.setPadding(this.f4628j, this.f4629k, this.f4630l, this.f4631m);
            }
            if (this.f4625g != null) {
                ((LinearLayout.LayoutParams) ((LinearLayoutCompat.b) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void z(ViewGroup viewGroup) {
        if (this.f4606G != null) {
            viewGroup.addView(this.f4606G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f4621c.findViewById(C2042a.g.f49657u0).setVisibility(8);
            return;
        }
        this.f4603D = (ImageView) this.f4621c.findViewById(R.id.icon);
        if ((!TextUtils.isEmpty(this.f4623e)) && this.f4615P) {
            TextView textView = (TextView) this.f4621c.findViewById(C2042a.g.f49646p);
            this.f4604E = textView;
            textView.setText(this.f4623e);
            int i4 = this.f4601B;
            if (i4 != 0) {
                this.f4603D.setImageResource(i4);
                return;
            }
            Drawable drawable = this.f4602C;
            if (drawable != null) {
                this.f4603D.setImageDrawable(drawable);
                return;
            } else {
                this.f4604E.setPadding(this.f4603D.getPaddingLeft(), this.f4603D.getPaddingTop(), this.f4603D.getPaddingRight(), this.f4603D.getPaddingBottom());
                this.f4603D.setVisibility(8);
                return;
            }
        }
        this.f4621c.findViewById(C2042a.g.f49657u0).setVisibility(8);
        this.f4603D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    public Button c(int i4) {
        if (i4 != -3) {
            if (i4 != -2) {
                if (i4 != -1) {
                    return null;
                }
                return this.f4633o;
            }
            return this.f4637s;
        }
        return this.f4641w;
    }

    public int d(int i4) {
        TypedValue typedValue = new TypedValue();
        this.f4619a.getTheme().resolveAttribute(i4, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView e() {
        return this.f4625g;
    }

    public void f() {
        this.f4620b.setContentView(k());
        A();
    }

    public boolean h(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4600A;
        if (nestedScrollView != null && nestedScrollView.w(keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean i(int i4, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4600A;
        if (nestedScrollView != null && nestedScrollView.w(keyEvent)) {
            return true;
        }
        return false;
    }

    public void l(int i4, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f4617R.obtainMessage(i4, onClickListener);
        }
        if (i4 != -3) {
            if (i4 != -2) {
                if (i4 == -1) {
                    this.f4634p = charSequence;
                    this.f4635q = message;
                    this.f4636r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f4638t = charSequence;
            this.f4639u = message;
            this.f4640v = drawable;
            return;
        }
        this.f4642x = charSequence;
        this.f4643y = message;
        this.f4644z = drawable;
    }

    public void m(int i4) {
        this.f4616Q = i4;
    }

    public void n(View view) {
        this.f4606G = view;
    }

    public void o(int i4) {
        this.f4602C = null;
        this.f4601B = i4;
        ImageView imageView = this.f4603D;
        if (imageView != null) {
            if (i4 != 0) {
                imageView.setVisibility(0);
                this.f4603D.setImageResource(this.f4601B);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void p(Drawable drawable) {
        this.f4602C = drawable;
        this.f4601B = 0;
        ImageView imageView = this.f4603D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f4603D.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public void q(CharSequence charSequence) {
        this.f4624f = charSequence;
        TextView textView = this.f4605F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void s(CharSequence charSequence) {
        this.f4623e = charSequence;
        TextView textView = this.f4604E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void t(int i4) {
        this.f4626h = null;
        this.f4627i = i4;
        this.f4632n = false;
    }

    public void u(View view) {
        this.f4626h = view;
        this.f4627i = 0;
        this.f4632n = false;
    }

    public void v(View view, int i4, int i5, int i6, int i7) {
        this.f4626h = view;
        this.f4627i = 0;
        this.f4632n = true;
        this.f4628j = i4;
        this.f4629k = i5;
        this.f4630l = i6;
        this.f4631m = i7;
    }
}

package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.N;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.F> {

    /* renamed from: e, reason: collision with root package name */
    static final String f17427e = "ConcatAdapter";

    /* renamed from: d, reason: collision with root package name */
    private final C0962h f17428d;

    /* loaded from: classes.dex */
    public static final class Config {

        /* renamed from: c, reason: collision with root package name */
        @N
        public static final Config f17429c = new Config(true, StableIdMode.NO_STABLE_IDS);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f17430a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final StableIdMode f17431b;

        /* loaded from: classes.dex */
        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f17432a;

            /* renamed from: b, reason: collision with root package name */
            private StableIdMode f17433b;

            public a() {
                Config config = Config.f17429c;
                this.f17432a = config.f17430a;
                this.f17433b = config.f17431b;
            }

            @N
            public Config a() {
                return new Config(this.f17432a, this.f17433b);
            }

            @N
            public a b(boolean z3) {
                this.f17432a = z3;
                return this;
            }

            @N
            public a c(@N StableIdMode stableIdMode) {
                this.f17433b = stableIdMode;
                return this;
            }
        }

        Config(boolean z3, @N StableIdMode stableIdMode) {
            this.f17430a = z3;
            this.f17431b = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(@N RecyclerView.Adapter<? extends RecyclerView.F>... adapterArr) {
        this(Config.f17429c, adapterArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void B(@N RecyclerView recyclerView) {
        this.f17428d.z(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void C(@N RecyclerView.F f4, int i4) {
        this.f17428d.A(f4, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @N
    public RecyclerView.F E(@N ViewGroup viewGroup, int i4) {
        return this.f17428d.B(viewGroup, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void F(@N RecyclerView recyclerView) {
        this.f17428d.C(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean G(@N RecyclerView.F f4) {
        return this.f17428d.D(f4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void H(@N RecyclerView.F f4) {
        this.f17428d.E(f4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void I(@N RecyclerView.F f4) {
        this.f17428d.F(f4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void J(@N RecyclerView.F f4) {
        this.f17428d.G(f4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void L(boolean z3) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void M(@N RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public boolean O(int i4, @N RecyclerView.Adapter<? extends RecyclerView.F> adapter) {
        return this.f17428d.h(i4, adapter);
    }

    public boolean P(@N RecyclerView.Adapter<? extends RecyclerView.F> adapter) {
        return this.f17428d.i(adapter);
    }

    @N
    public List<? extends RecyclerView.Adapter<? extends RecyclerView.F>> Q() {
        return Collections.unmodifiableList(this.f17428d.q());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(@N RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.M(stateRestorationPolicy);
    }

    public boolean S(@N RecyclerView.Adapter<? extends RecyclerView.F> adapter) {
        return this.f17428d.I(adapter);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int k(@N RecyclerView.Adapter<? extends RecyclerView.F> adapter, @N RecyclerView.F f4, int i4) {
        return this.f17428d.t(adapter, f4, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int l() {
        return this.f17428d.u();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long m(int i4) {
        return this.f17428d.r(i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int n(int i4) {
        return this.f17428d.s(i4);
    }

    @SafeVarargs
    public ConcatAdapter(@N Config config, @N RecyclerView.Adapter<? extends RecyclerView.F>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.F>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(@N List<? extends RecyclerView.Adapter<? extends RecyclerView.F>> list) {
        this(Config.f17429c, list);
    }

    public ConcatAdapter(@N Config config, @N List<? extends RecyclerView.Adapter<? extends RecyclerView.F>> list) {
        this.f17428d = new C0962h(this, config);
        Iterator<? extends RecyclerView.Adapter<? extends RecyclerView.F>> it = list.iterator();
        while (it.hasNext()) {
            P(it.next());
        }
        super.L(this.f17428d.w());
    }
}

package androidx.fragment.app;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* loaded from: classes.dex */
public class ListFragment extends Fragment {

    /* renamed from: Y0, reason: collision with root package name */
    static final int f15195Y0 = 16711681;

    /* renamed from: Z0, reason: collision with root package name */
    static final int f15196Z0 = 16711682;

    /* renamed from: a1, reason: collision with root package name */
    static final int f15197a1 = 16711683;

    /* renamed from: N0, reason: collision with root package name */
    private final Handler f15198N0 = new Handler();

    /* renamed from: O0, reason: collision with root package name */
    private final Runnable f15199O0 = new a();

    /* renamed from: P0, reason: collision with root package name */
    private final AdapterView.OnItemClickListener f15200P0 = new b();

    /* renamed from: Q0, reason: collision with root package name */
    ListAdapter f15201Q0;

    /* renamed from: R0, reason: collision with root package name */
    ListView f15202R0;

    /* renamed from: S0, reason: collision with root package name */
    View f15203S0;

    /* renamed from: T0, reason: collision with root package name */
    TextView f15204T0;

    /* renamed from: U0, reason: collision with root package name */
    View f15205U0;

    /* renamed from: V0, reason: collision with root package name */
    View f15206V0;

    /* renamed from: W0, reason: collision with root package name */
    CharSequence f15207W0;

    /* renamed from: X0, reason: collision with root package name */
    boolean f15208X0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListView listView = ListFragment.this.f15202R0;
            listView.focusableViewAvailable(listView);
        }
    }

    /* loaded from: classes.dex */
    class b implements AdapterView.OnItemClickListener {
        b() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
            ListFragment.this.onListItemClick((ListView) adapterView, view, i4, j4);
        }
    }

    private void k0() {
        if (this.f15202R0 != null) {
            return;
        }
        View view = getView();
        if (view != null) {
            if (view instanceof ListView) {
                this.f15202R0 = (ListView) view;
            } else {
                TextView textView = (TextView) view.findViewById(f15195Y0);
                this.f15204T0 = textView;
                if (textView == null) {
                    this.f15203S0 = view.findViewById(R.id.empty);
                } else {
                    textView.setVisibility(8);
                }
                this.f15205U0 = view.findViewById(f15196Z0);
                this.f15206V0 = view.findViewById(f15197a1);
                View findViewById = view.findViewById(R.id.list);
                if (!(findViewById instanceof ListView)) {
                    if (findViewById == null) {
                        throw new RuntimeException("Your content must have a ListView whose id attribute is 'android.R.id.list'");
                    }
                    throw new RuntimeException("Content has view with id attribute 'android.R.id.list' that is not a ListView class");
                }
                ListView listView = (ListView) findViewById;
                this.f15202R0 = listView;
                View view2 = this.f15203S0;
                if (view2 != null) {
                    listView.setEmptyView(view2);
                } else {
                    CharSequence charSequence = this.f15207W0;
                    if (charSequence != null) {
                        this.f15204T0.setText(charSequence);
                        this.f15202R0.setEmptyView(this.f15204T0);
                    }
                }
            }
            this.f15208X0 = true;
            this.f15202R0.setOnItemClickListener(this.f15200P0);
            ListAdapter listAdapter = this.f15201Q0;
            if (listAdapter != null) {
                this.f15201Q0 = null;
                setListAdapter(listAdapter);
            } else if (this.f15205U0 != null) {
                l0(false, false);
            }
            this.f15198N0.post(this.f15199O0);
            return;
        }
        throw new IllegalStateException("Content view not yet created");
    }

    private void l0(boolean z3, boolean z4) {
        k0();
        View view = this.f15205U0;
        if (view != null) {
            if (this.f15208X0 == z3) {
                return;
            }
            this.f15208X0 = z3;
            if (z3) {
                if (z4) {
                    view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
                    this.f15206V0.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                } else {
                    view.clearAnimation();
                    this.f15206V0.clearAnimation();
                }
                this.f15205U0.setVisibility(8);
                this.f15206V0.setVisibility(0);
                return;
            }
            if (z4) {
                view.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_in));
                this.f15206V0.startAnimation(AnimationUtils.loadAnimation(getContext(), R.anim.fade_out));
            } else {
                view.clearAnimation();
                this.f15206V0.clearAnimation();
            }
            this.f15205U0.setVisibility(0);
            this.f15206V0.setVisibility(8);
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    @androidx.annotation.P
    public ListAdapter getListAdapter() {
        return this.f15201Q0;
    }

    @androidx.annotation.N
    public ListView getListView() {
        k0();
        return this.f15202R0;
    }

    public long getSelectedItemId() {
        k0();
        return this.f15202R0.getSelectedItemId();
    }

    public int getSelectedItemPosition() {
        k0();
        return this.f15202R0.getSelectedItemPosition();
    }

    @Override // androidx.fragment.app.Fragment
    @androidx.annotation.P
    public View onCreateView(@androidx.annotation.N LayoutInflater layoutInflater, @androidx.annotation.P ViewGroup viewGroup, @androidx.annotation.P Bundle bundle) {
        Context requireContext = requireContext();
        FrameLayout frameLayout = new FrameLayout(requireContext);
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setId(f15196Z0);
        linearLayout.setOrientation(1);
        linearLayout.setVisibility(8);
        linearLayout.setGravity(17);
        linearLayout.addView(new ProgressBar(requireContext, null, R.attr.progressBarStyleLarge), new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout, new FrameLayout.LayoutParams(-1, -1));
        FrameLayout frameLayout2 = new FrameLayout(requireContext);
        frameLayout2.setId(f15197a1);
        TextView textView = new TextView(requireContext);
        textView.setId(f15195Y0);
        textView.setGravity(17);
        frameLayout2.addView(textView, new FrameLayout.LayoutParams(-1, -1));
        ListView listView = new ListView(requireContext);
        listView.setId(R.id.list);
        listView.setDrawSelectorOnTop(false);
        frameLayout2.addView(listView, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f15198N0.removeCallbacks(this.f15199O0);
        this.f15202R0 = null;
        this.f15208X0 = false;
        this.f15206V0 = null;
        this.f15205U0 = null;
        this.f15203S0 = null;
        this.f15204T0 = null;
        super.onDestroyView();
    }

    public void onListItemClick(@androidx.annotation.N ListView listView, @androidx.annotation.N View view, int i4, long j4) {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@androidx.annotation.N View view, @androidx.annotation.P Bundle bundle) {
        super.onViewCreated(view, bundle);
        k0();
    }

    @androidx.annotation.N
    public final ListAdapter requireListAdapter() {
        ListAdapter listAdapter = getListAdapter();
        if (listAdapter != null) {
            return listAdapter;
        }
        throw new IllegalStateException("ListFragment " + this + " does not have a ListAdapter.");
    }

    public void setEmptyText(@androidx.annotation.P CharSequence charSequence) {
        k0();
        TextView textView = this.f15204T0;
        if (textView != null) {
            textView.setText(charSequence);
            if (this.f15207W0 == null) {
                this.f15202R0.setEmptyView(this.f15204T0);
            }
            this.f15207W0 = charSequence;
            return;
        }
        throw new IllegalStateException("Can't be used with a custom content view");
    }

    public void setListAdapter(@androidx.annotation.P ListAdapter listAdapter) {
        boolean z3;
        boolean z4 = false;
        if (this.f15201Q0 != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f15201Q0 = listAdapter;
        ListView listView = this.f15202R0;
        if (listView != null) {
            listView.setAdapter(listAdapter);
            if (!this.f15208X0 && !z3) {
                if (requireView().getWindowToken() != null) {
                    z4 = true;
                }
                l0(true, z4);
            }
        }
    }

    public void setListShown(boolean z3) {
        l0(z3, true);
    }

    public void setListShownNoAnimation(boolean z3) {
        l0(z3, false);
    }

    public void setSelection(int i4) {
        k0();
        this.f15202R0.setSelection(i4);
    }
}

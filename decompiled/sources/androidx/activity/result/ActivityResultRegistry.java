package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.K;
import androidx.annotation.N;
import androidx.annotation.P;
import androidx.core.app.C0623e;
import androidx.lifecycle.A;
import androidx.lifecycle.E;
import androidx.lifecycle.Lifecycle;
import b.AbstractC1000a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* renamed from: i, reason: collision with root package name */
    private static final String f4521i = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* renamed from: j, reason: collision with root package name */
    private static final String f4522j = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* renamed from: k, reason: collision with root package name */
    private static final String f4523k = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* renamed from: l, reason: collision with root package name */
    private static final String f4524l = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* renamed from: m, reason: collision with root package name */
    private static final String f4525m = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* renamed from: n, reason: collision with root package name */
    private static final String f4526n = "ActivityResultRegistry";

    /* renamed from: o, reason: collision with root package name */
    private static final int f4527o = 65536;

    /* renamed from: a, reason: collision with root package name */
    private Random f4528a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map<Integer, String> f4529b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map<String, Integer> f4530c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, d> f4531d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList<String> f4532e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    final transient Map<String, c<?>> f4533f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map<String, Object> f4534g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f4535h = new Bundle();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class a<I> extends i<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4540a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1000a f4541b;

        a(String str, AbstractC1000a abstractC1000a) {
            this.f4540a = str;
            this.f4541b = abstractC1000a;
        }

        @Override // androidx.activity.result.i
        @N
        public AbstractC1000a<I, ?> a() {
            return this.f4541b;
        }

        @Override // androidx.activity.result.i
        public void c(I i4, @P C0623e c0623e) {
            Integer num = ActivityResultRegistry.this.f4530c.get(this.f4540a);
            if (num != null) {
                ActivityResultRegistry.this.f4532e.add(this.f4540a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f4541b, i4, c0623e);
                    return;
                } catch (Exception e4) {
                    ActivityResultRegistry.this.f4532e.remove(this.f4540a);
                    throw e4;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f4541b + " and input " + i4 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.i
        public void d() {
            ActivityResultRegistry.this.l(this.f4540a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: Add missing generic type declarations: [I] */
    /* loaded from: classes.dex */
    public class b<I> extends i<I> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4543a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC1000a f4544b;

        b(String str, AbstractC1000a abstractC1000a) {
            this.f4543a = str;
            this.f4544b = abstractC1000a;
        }

        @Override // androidx.activity.result.i
        @N
        public AbstractC1000a<I, ?> a() {
            return this.f4544b;
        }

        @Override // androidx.activity.result.i
        public void c(I i4, @P C0623e c0623e) {
            Integer num = ActivityResultRegistry.this.f4530c.get(this.f4543a);
            if (num != null) {
                ActivityResultRegistry.this.f4532e.add(this.f4543a);
                try {
                    ActivityResultRegistry.this.f(num.intValue(), this.f4544b, i4, c0623e);
                    return;
                } catch (Exception e4) {
                    ActivityResultRegistry.this.f4532e.remove(this.f4543a);
                    throw e4;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f4544b + " and input " + i4 + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // androidx.activity.result.i
        public void d() {
            ActivityResultRegistry.this.l(this.f4543a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c<O> {

        /* renamed from: a, reason: collision with root package name */
        final androidx.activity.result.b<O> f4546a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC1000a<?, O> f4547b;

        c(androidx.activity.result.b<O> bVar, AbstractC1000a<?, O> abstractC1000a) {
            this.f4546a = bVar;
            this.f4547b = abstractC1000a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        final Lifecycle f4548a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<A> f4549b = new ArrayList<>();

        d(@N Lifecycle lifecycle) {
            this.f4548a = lifecycle;
        }

        void a(@N A a4) {
            this.f4548a.a(a4);
            this.f4549b.add(a4);
        }

        void b() {
            Iterator<A> it = this.f4549b.iterator();
            while (it.hasNext()) {
                this.f4548a.d(it.next());
            }
            this.f4549b.clear();
        }
    }

    private void a(int i4, String str) {
        this.f4529b.put(Integer.valueOf(i4), str);
        this.f4530c.put(str, Integer.valueOf(i4));
    }

    private <O> void d(String str, int i4, @P Intent intent, @P c<O> cVar) {
        if (cVar != null && cVar.f4546a != null && this.f4532e.contains(str)) {
            cVar.f4546a.a(cVar.f4547b.c(i4, intent));
            this.f4532e.remove(str);
        } else {
            this.f4534g.remove(str);
            this.f4535h.putParcelable(str, new androidx.activity.result.a(i4, intent));
        }
    }

    private int e() {
        int nextInt = this.f4528a.nextInt(2147418112);
        while (true) {
            int i4 = nextInt + 65536;
            if (this.f4529b.containsKey(Integer.valueOf(i4))) {
                nextInt = this.f4528a.nextInt(2147418112);
            } else {
                return i4;
            }
        }
    }

    private void k(String str) {
        if (this.f4530c.get(str) != null) {
            return;
        }
        a(e(), str);
    }

    @K
    public final boolean b(int i4, int i5, @P Intent intent) {
        String str = this.f4529b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        d(str, i5, intent, this.f4533f.get(str));
        return true;
    }

    @K
    public final <O> boolean c(int i4, @SuppressLint({"UnknownNullness"}) O o4) {
        androidx.activity.result.b<?> bVar;
        String str = this.f4529b.get(Integer.valueOf(i4));
        if (str == null) {
            return false;
        }
        c<?> cVar = this.f4533f.get(str);
        if (cVar != null && (bVar = cVar.f4546a) != null) {
            if (this.f4532e.remove(str)) {
                bVar.a(o4);
                return true;
            }
            return true;
        }
        this.f4535h.remove(str);
        this.f4534g.put(str, o4);
        return true;
    }

    @K
    public abstract <I, O> void f(int i4, @N AbstractC1000a<I, O> abstractC1000a, @SuppressLint({"UnknownNullness"}) I i5, @P C0623e c0623e);

    public final void g(@P Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f4521i);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f4522j);
        if (stringArrayList != null && integerArrayList != null) {
            this.f4532e = bundle.getStringArrayList(f4523k);
            this.f4528a = (Random) bundle.getSerializable(f4525m);
            this.f4535h.putAll(bundle.getBundle(f4524l));
            for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                String str = stringArrayList.get(i4);
                if (this.f4530c.containsKey(str)) {
                    Integer remove = this.f4530c.remove(str);
                    if (!this.f4535h.containsKey(str)) {
                        this.f4529b.remove(remove);
                    }
                }
                a(integerArrayList.get(i4).intValue(), stringArrayList.get(i4));
            }
        }
    }

    public final void h(@N Bundle bundle) {
        bundle.putIntegerArrayList(f4521i, new ArrayList<>(this.f4530c.values()));
        bundle.putStringArrayList(f4522j, new ArrayList<>(this.f4530c.keySet()));
        bundle.putStringArrayList(f4523k, new ArrayList<>(this.f4532e));
        bundle.putBundle(f4524l, (Bundle) this.f4535h.clone());
        bundle.putSerializable(f4525m, this.f4528a);
    }

    @N
    public final <I, O> i<I> i(@N final String str, @N E e4, @N final AbstractC1000a<I, O> abstractC1000a, @N final androidx.activity.result.b<O> bVar) {
        Lifecycle lifecycle = e4.getLifecycle();
        if (!lifecycle.b().e(Lifecycle.State.STARTED)) {
            k(str);
            d dVar = this.f4531d.get(str);
            if (dVar == null) {
                dVar = new d(lifecycle);
            }
            dVar.a(new A() { // from class: androidx.activity.result.ActivityResultRegistry.1
                @Override // androidx.lifecycle.A
                public void f(@N E e5, @N Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f4533f.put(str, new c<>(bVar, abstractC1000a));
                        if (ActivityResultRegistry.this.f4534g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f4534g.get(str);
                            ActivityResultRegistry.this.f4534g.remove(str);
                            bVar.a(obj);
                        }
                        androidx.activity.result.a aVar = (androidx.activity.result.a) ActivityResultRegistry.this.f4535h.getParcelable(str);
                        if (aVar != null) {
                            ActivityResultRegistry.this.f4535h.remove(str);
                            bVar.a(abstractC1000a.c(aVar.b(), aVar.a()));
                            return;
                        }
                        return;
                    }
                    if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f4533f.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.l(str);
                    }
                }
            });
            this.f4531d.put(str, dVar);
            return new a(str, abstractC1000a);
        }
        throw new IllegalStateException("LifecycleOwner " + e4 + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @N
    public final <I, O> i<I> j(@N String str, @N AbstractC1000a<I, O> abstractC1000a, @N androidx.activity.result.b<O> bVar) {
        k(str);
        this.f4533f.put(str, new c<>(bVar, abstractC1000a));
        if (this.f4534g.containsKey(str)) {
            Object obj = this.f4534g.get(str);
            this.f4534g.remove(str);
            bVar.a(obj);
        }
        androidx.activity.result.a aVar = (androidx.activity.result.a) this.f4535h.getParcelable(str);
        if (aVar != null) {
            this.f4535h.remove(str);
            bVar.a(abstractC1000a.c(aVar.b(), aVar.a()));
        }
        return new b(str, abstractC1000a);
    }

    @K
    final void l(@N String str) {
        Integer remove;
        if (!this.f4532e.contains(str) && (remove = this.f4530c.remove(str)) != null) {
            this.f4529b.remove(remove);
        }
        this.f4533f.remove(str);
        if (this.f4534g.containsKey(str)) {
            Log.w(f4526n, "Dropping pending result for request " + str + ": " + this.f4534g.get(str));
            this.f4534g.remove(str);
        }
        if (this.f4535h.containsKey(str)) {
            Log.w(f4526n, "Dropping pending result for request " + str + ": " + this.f4535h.getParcelable(str));
            this.f4535h.remove(str);
        }
        d dVar = this.f4531d.get(str);
        if (dVar != null) {
            dVar.b();
            this.f4531d.remove(str);
        }
    }
}

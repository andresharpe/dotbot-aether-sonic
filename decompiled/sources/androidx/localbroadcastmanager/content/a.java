package androidx.localbroadcastmanager.content;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.N;
import com.google.firebase.messaging.C1821f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    private static final String f15815f = "LocalBroadcastManager";

    /* renamed from: g, reason: collision with root package name */
    private static final boolean f15816g = false;

    /* renamed from: h, reason: collision with root package name */
    static final int f15817h = 1;

    /* renamed from: i, reason: collision with root package name */
    private static final Object f15818i = new Object();

    /* renamed from: j, reason: collision with root package name */
    private static a f15819j;

    /* renamed from: a, reason: collision with root package name */
    private final Context f15820a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f15821b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f15822c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final ArrayList<b> f15823d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private final Handler f15824e;

    /* renamed from: androidx.localbroadcastmanager.content.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class HandlerC0149a extends Handler {
        HandlerC0149a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final Intent f15826a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f15827b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.f15826a = intent;
            this.f15827b = arrayList;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f15828a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f15829b;

        /* renamed from: c, reason: collision with root package name */
        boolean f15830c;

        /* renamed from: d, reason: collision with root package name */
        boolean f15831d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f15828a = intentFilter;
            this.f15829b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f15829b);
            sb.append(" filter=");
            sb.append(this.f15828a);
            if (this.f15831d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f15820a = context;
        this.f15824e = new HandlerC0149a(context.getMainLooper());
    }

    @N
    public static a b(@N Context context) {
        a aVar;
        synchronized (f15818i) {
            try {
                if (f15819j == null) {
                    f15819j = new a(context.getApplicationContext());
                }
                aVar = f15819j;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f15821b) {
                try {
                    size = this.f15823d.size();
                    if (size <= 0) {
                        return;
                    }
                    bVarArr = new b[size];
                    this.f15823d.toArray(bVarArr);
                    this.f15823d.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (int i4 = 0; i4 < size; i4++) {
                b bVar = bVarArr[i4];
                int size2 = bVar.f15827b.size();
                for (int i5 = 0; i5 < size2; i5++) {
                    c cVar = bVar.f15827b.get(i5);
                    if (!cVar.f15831d) {
                        cVar.f15829b.onReceive(this.f15820a, bVar.f15826a);
                    }
                }
            }
        }
    }

    public void c(@N BroadcastReceiver broadcastReceiver, @N IntentFilter intentFilter) {
        synchronized (this.f15821b) {
            try {
                c cVar = new c(intentFilter, broadcastReceiver);
                ArrayList<c> arrayList = this.f15821b.get(broadcastReceiver);
                if (arrayList == null) {
                    arrayList = new ArrayList<>(1);
                    this.f15821b.put(broadcastReceiver, arrayList);
                }
                arrayList.add(cVar);
                for (int i4 = 0; i4 < intentFilter.countActions(); i4++) {
                    String action = intentFilter.getAction(i4);
                    ArrayList<c> arrayList2 = this.f15822c.get(action);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>(1);
                        this.f15822c.put(action, arrayList2);
                    }
                    arrayList2.add(cVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean d(@N Intent intent) {
        boolean z3;
        int i4;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        String str3;
        synchronized (this.f15821b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f15820a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                if ((intent.getFlags() & 8) != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    Log.v(f15815f, "Resolving type " + resolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
                }
                ArrayList<c> arrayList3 = this.f15822c.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z3) {
                        Log.v(f15815f, "Action list: " + arrayList3);
                    }
                    ArrayList arrayList4 = null;
                    int i5 = 0;
                    while (i5 < arrayList3.size()) {
                        c cVar = arrayList3.get(i5);
                        if (z3) {
                            Log.v(f15815f, "Matching against filter " + cVar.f15828a);
                        }
                        if (cVar.f15830c) {
                            if (z3) {
                                Log.v(f15815f, "  Filter's target already added");
                            }
                            i4 = i5;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i4 = i5;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = cVar.f15828a.match(action, resolveTypeIfNeeded, scheme, data, categories, f15815f);
                            if (match >= 0) {
                                if (z3) {
                                    Log.v(f15815f, "  Filter matched!  match=0x" + Integer.toHexString(match));
                                }
                                if (arrayList == null) {
                                    arrayList4 = new ArrayList();
                                } else {
                                    arrayList4 = arrayList;
                                }
                                arrayList4.add(cVar);
                                cVar.f15830c = true;
                                i5 = i4 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z3) {
                                if (match != -4) {
                                    if (match != -3) {
                                        if (match != -2) {
                                            if (match != -1) {
                                                str3 = "unknown reason";
                                            } else {
                                                str3 = "type";
                                            }
                                        } else {
                                            str3 = C1821f.C0339f.a.f37006R;
                                        }
                                    } else {
                                        str3 = "action";
                                    }
                                } else {
                                    str3 = "category";
                                }
                                Log.v(f15815f, "  Filter did not match: " + str3);
                            }
                        }
                        arrayList4 = arrayList;
                        i5 = i4 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            ((c) arrayList5.get(i6)).f15830c = false;
                        }
                        this.f15823d.add(new b(intent, arrayList5));
                        if (!this.f15824e.hasMessages(1)) {
                            this.f15824e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(@N Intent intent) {
        if (d(intent)) {
            a();
        }
    }

    public void f(@N BroadcastReceiver broadcastReceiver) {
        synchronized (this.f15821b) {
            try {
                ArrayList<c> remove = this.f15821b.remove(broadcastReceiver);
                if (remove == null) {
                    return;
                }
                for (int size = remove.size() - 1; size >= 0; size--) {
                    c cVar = remove.get(size);
                    cVar.f15831d = true;
                    for (int i4 = 0; i4 < cVar.f15828a.countActions(); i4++) {
                        String action = cVar.f15828a.getAction(i4);
                        ArrayList<c> arrayList = this.f15822c.get(action);
                        if (arrayList != null) {
                            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                                c cVar2 = arrayList.get(size2);
                                if (cVar2.f15829b == broadcastReceiver) {
                                    cVar2.f15831d = true;
                                    arrayList.remove(size2);
                                }
                            }
                            if (arrayList.size() <= 0) {
                                this.f15822c.remove(action);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

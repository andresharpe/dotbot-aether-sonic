package com.clj.fastble.bluetooth;

import android.bluetooth.BluetoothDevice;
import com.clj.fastble.utils.BleLruHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final BleLruHashMap<String, com.clj.fastble.bluetooth.a> f27027a = new BleLruHashMap<>(com.clj.fastble.a.w().x());

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, com.clj.fastble.bluetooth.a> f27028b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Comparator<com.clj.fastble.bluetooth.a> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(com.clj.fastble.bluetooth.a aVar, com.clj.fastble.bluetooth.a aVar2) {
            return aVar.K().compareToIgnoreCase(aVar2.K());
        }
    }

    public synchronized void a(com.clj.fastble.bluetooth.a aVar) {
        if (aVar == null) {
            return;
        }
        if (!this.f27027a.containsKey(aVar.K())) {
            this.f27027a.put(aVar.K(), aVar);
        }
    }

    public synchronized com.clj.fastble.bluetooth.a b(com.clj.fastble.data.b bVar) {
        com.clj.fastble.bluetooth.a aVar;
        aVar = new com.clj.fastble.bluetooth.a(bVar);
        if (!this.f27028b.containsKey(aVar.K())) {
            this.f27028b.put(aVar.K(), aVar);
        }
        return aVar;
    }

    public synchronized void c() {
        try {
            Iterator<Map.Entry<String, com.clj.fastble.bluetooth.a>> it = this.f27027a.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().F();
            }
            this.f27027a.clear();
            Iterator<Map.Entry<String, com.clj.fastble.bluetooth.a>> it2 = this.f27028b.entrySet().iterator();
            while (it2.hasNext()) {
                it2.next().getValue().F();
            }
            this.f27028b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void d(com.clj.fastble.data.b bVar) {
        if (j(bVar)) {
            f(bVar).G();
        }
    }

    public synchronized void e() {
        try {
            Iterator<Map.Entry<String, com.clj.fastble.bluetooth.a>> it = this.f27027a.entrySet().iterator();
            while (it.hasNext()) {
                it.next().getValue().G();
            }
            this.f27027a.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized com.clj.fastble.bluetooth.a f(com.clj.fastble.data.b bVar) {
        if (bVar != null) {
            if (this.f27027a.containsKey(bVar.b())) {
                return this.f27027a.get(bVar.b());
            }
        }
        return null;
    }

    public synchronized List<com.clj.fastble.bluetooth.a> g() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f27027a.values());
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public synchronized List<com.clj.fastble.data.b> h() {
        ArrayList arrayList;
        k();
        arrayList = new ArrayList();
        for (com.clj.fastble.bluetooth.a aVar : g()) {
            if (aVar != null) {
                arrayList.add(aVar.J());
            }
        }
        return arrayList;
    }

    public synchronized boolean i(BluetoothDevice bluetoothDevice) {
        boolean z3;
        if (bluetoothDevice != null) {
            if (this.f27027a.containsKey(bluetoothDevice.getName() + bluetoothDevice.getAddress())) {
                z3 = true;
            }
        }
        z3 = false;
        return z3;
    }

    public synchronized boolean j(com.clj.fastble.data.b bVar) {
        boolean z3;
        if (bVar != null) {
            if (this.f27027a.containsKey(bVar.b())) {
                z3 = true;
            }
        }
        z3 = false;
        return z3;
    }

    public void k() {
        List<com.clj.fastble.bluetooth.a> g4 = g();
        for (int i4 = 0; g4 != null && i4 < g4.size(); i4++) {
            com.clj.fastble.bluetooth.a aVar = g4.get(i4);
            if (!com.clj.fastble.a.w().K(aVar.J())) {
                l(aVar);
            }
        }
    }

    public synchronized void l(com.clj.fastble.bluetooth.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f27027a.containsKey(aVar.K())) {
            this.f27027a.remove(aVar.K());
        }
    }

    public synchronized void m(com.clj.fastble.bluetooth.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f27028b.containsKey(aVar.K())) {
            this.f27028b.remove(aVar.K());
        }
    }
}

package v0;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import com.clj.fastble.exception.BleException;

@TargetApi(18)
/* loaded from: classes.dex */
public abstract class b extends BluetoothGattCallback {
    public abstract void n(com.clj.fastble.data.b bVar, BleException bleException);

    public abstract void o(com.clj.fastble.data.b bVar, BluetoothGatt bluetoothGatt, int i4);

    public abstract void p(boolean z3, com.clj.fastble.data.b bVar, BluetoothGatt bluetoothGatt, int i4);

    public abstract void q();
}

package listener;

import bridge.Bridge;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BridgeTransferListener implements ActionListener {

    private Bridge bridge;

    public BridgeTransferListener(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        bridge.performBridge();
    }
}

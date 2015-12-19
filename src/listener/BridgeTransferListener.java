package listener;

import bridge.reflect.Reflecting;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BridgeTransferListener implements ActionListener {

    private Reflecting reflecting;

    public BridgeTransferListener(Reflecting reflecting) {
        this.reflecting = reflecting;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        reflecting.reflect();
    }
}

package template;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/24/2021 11:01 PM
 */
public abstract class Task  {

    private AuditTrail auditTrail;

    public Task(){
        this.auditTrail = new AuditTrail();
    }

    public void execute(){
        auditTrail.record();
        doexecute();
    }

    protected abstract void doexecute();
}

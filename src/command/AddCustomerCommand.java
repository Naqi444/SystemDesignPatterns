package command;

import command.fx.Command;

/**
 * @author Syed Naqi Hussain
 * @version 1.0
 * @date 3/25/2021 1:00 AM
 */
public class AddCustomerCommand  implements Command {

    private CustomerService service;

    public AddCustomerCommand(CustomerService service) {
        this.service = service;
    }

    @Override
    public void execute() {
        service.addCustomer();
    }
}

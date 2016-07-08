package org.seedstack.samples.spring.payment.impl;

import org.seedstack.samples.spring.payment.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CashPaymentService implements PaymentService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CashPaymentService.class);

    @Override
    public String getType() {
        return "cash";
    }

    @Override
    public void pay(double amount) {
        LOGGER.info("Paying {} with cash", amount);
    }
}

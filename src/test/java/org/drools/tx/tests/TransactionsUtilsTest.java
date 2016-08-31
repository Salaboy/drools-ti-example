/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.drools.tx.tests;

import java.net.URL;
import java.util.List;
import org.drools.tx.model.Transaction;
import org.drools.tx.utils.TransactionFactory;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;

/**
 *
 * @author salaboy
 */
public class TransactionsUtilsTest {

    @Test
    public void hello() throws Exception {
        URL resource = this.getClass().getResource( "/data/data-mini.csv" );
        assertNotNull( resource );
        String filePath = resource.getFile();
        System.out.println( " FilePath: " + filePath );
        List<Transaction> txs = TransactionFactory.createTxsFromCSV( filePath );

        System.out.println( "Size: " + txs.size() );

        for ( Transaction tx : txs ) {
            System.out.println( "TX: " + tx );

        }
    }
}

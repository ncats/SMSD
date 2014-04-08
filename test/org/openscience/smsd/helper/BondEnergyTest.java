
/* Copyright (C) 2009-2014 Syed Asad Rahman <asad@ebi.ac.uk>
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 * All we ask is that proper credit is given for our work, which includes
 * - but is not limited to - adding the above copyright notice to the beginning
 * of your source code files, and to any copyright notice that you may distribute
 * with programs based on this work.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openscience.smsd.helper;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.openscience.cdk.interfaces.IBond.Order;
import org.openscience.cdk.smsd.helper.BondEnergy;

/**
 * @author Syed Asad Rahman <asad@ebi.ac.uk>
 *
 * @cdk.module test-smsd
 * @cdk.require java1.6+
 */
public class BondEnergyTest {

    public BondEnergyTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getSymbolFirstAtom method, of class BondEnergy.
     */
    @Test
    public void testGetSymbolFirstAtom() {
        //////System.out.println("getSymbolFirstAtom");
        BondEnergy instance = new BondEnergy("H", "I", Order.SINGLE, 295);
        String expResult = "H";
        String result = instance.getSymbolFirstAtom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSymbolSecondAtom method, of class BondEnergy.
     */
    @Test
    public void testGetSymbolSecondAtom() {
        //////System.out.println("getSymbolSecondAtom");
        BondEnergy instance = new BondEnergy("H", "I", Order.SINGLE, 295);
        String expResult = "I";
        String result = instance.getSymbolSecondAtom();
        assertEquals(expResult, result);
    }

    /**
     * Test of getBondOrder method, of class BondEnergy.
     */
    @Test
    public void testGetBondOrder() {
        //////System.out.println("getBondOrder");
        BondEnergy instance = new BondEnergy("H", "I", Order.SINGLE, 295);
        Order expResult = Order.SINGLE;
        Order result = instance.getBondOrder();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEnergy method, of class BondEnergy.
     */
    @Test
    public void testGetEnergy() {
        //////System.out.println("getEnergy");
        BondEnergy instance = new BondEnergy("H", "I", Order.SINGLE, 295);
        int expResult = 295;
        int result = instance.getEnergy();
        assertEquals(expResult, result);
    }
}

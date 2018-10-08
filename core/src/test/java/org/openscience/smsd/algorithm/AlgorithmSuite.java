
/* Copyright (C) 2009-2014 Syed Asad Rahman <s9asad@gmail.com>
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
package org.openscience.smsd.algorithm;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * @author Syed Asad Rahman <s9asad@gmail.com>
 *
 *  test-smsd
 *  java1.8+
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({org.openscience.smsd.algorithm.single.SingleSuite.class,
    org.openscience.smsd.algorithm.vflib.VFSuite.class,
    org.openscience.smsd.algorithm.mcsplus.McsplusSuite.class,
    //        org.openscience.smsd.algorithm.mcgregor.McgregorSuite.class,
    org.openscience.smsd.algorithm.rgraph.CdkSuite.class
})
public class AlgorithmSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
}

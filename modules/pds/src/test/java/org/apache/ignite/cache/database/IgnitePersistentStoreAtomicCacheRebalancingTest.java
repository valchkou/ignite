package org.apache.ignite.cache.database;

import org.apache.ignite.cache.CacheAtomicityMode;
import org.apache.ignite.cache.CacheMode;
import org.apache.ignite.cache.CacheWriteSynchronizationMode;
import org.apache.ignite.configuration.CacheConfiguration;

/**
 *
 */
public class IgnitePersistentStoreAtomicCacheRebalancingTest extends IgnitePersistentStoreCacheRebalancingAbstractTest {
    /** {@inheritDoc} */
    @Override protected CacheConfiguration cacheConfiguration(String cacheName) {
        CacheConfiguration ccfg = new CacheConfiguration(cacheName);

        ccfg.setAtomicityMode(CacheAtomicityMode.ATOMIC);
        ccfg.setCacheMode(CacheMode.PARTITIONED);
        ccfg.setBackups(1);
        ccfg.setWriteSynchronizationMode(CacheWriteSynchronizationMode.FULL_SYNC);

        return ccfg;
    }
}
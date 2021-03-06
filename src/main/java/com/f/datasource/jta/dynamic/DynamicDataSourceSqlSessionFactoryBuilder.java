/*
 *
 *  * Copyright 2016 http://www.hswebframework.org
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.f.datasource.jta.dynamic;

import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * @Author rebysfu@gmail.com
 * @Description  重写默认sqlsessionFactory实现
 * @Date 下午2:00 2018/9/23
 **/
public class DynamicDataSourceSqlSessionFactoryBuilder extends SqlSessionFactoryBuilder {
    @Override
    public SqlSessionFactory build(Configuration config) {
        return new DynamicSqlSessionFactory(config);
    }
}

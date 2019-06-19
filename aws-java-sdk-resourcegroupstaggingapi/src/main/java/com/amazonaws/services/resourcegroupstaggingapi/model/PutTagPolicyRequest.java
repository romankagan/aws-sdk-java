/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.resourcegroupstaggingapi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resourcegroupstaggingapi-2017-01-26/PutTagPolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutTagPolicyRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS
     * Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     */
    private String targetId;
    /**
     * <p>
     * The tag policy to attach to the target.
     * </p>
     */
    private String policy;

    /**
     * <p>
     * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS
     * Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     * 
     * @param targetId
     *        The account ID or the root identifier of the organization. If you don't know the root ID, you can call the
     *        AWS Organizations <a
     *        href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API
     *        to find it.
     */

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    /**
     * <p>
     * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS
     * Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     * 
     * @return The account ID or the root identifier of the organization. If you don't know the root ID, you can call
     *         the AWS Organizations <a
     *         href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API
     *         to find it.
     */

    public String getTargetId() {
        return this.targetId;
    }

    /**
     * <p>
     * The account ID or the root identifier of the organization. If you don't know the root ID, you can call the AWS
     * Organizations <a
     * href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API to find
     * it.
     * </p>
     * 
     * @param targetId
     *        The account ID or the root identifier of the organization. If you don't know the root ID, you can call the
     *        AWS Organizations <a
     *        href="http://docs.aws.amazon.com/organizations/latest/APIReference/API_ListRoots.html">ListRoots</a> API
     *        to find it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTagPolicyRequest withTargetId(String targetId) {
        setTargetId(targetId);
        return this;
    }

    /**
     * <p>
     * The tag policy to attach to the target.
     * </p>
     * 
     * @param policy
     *        The tag policy to attach to the target.
     */

    public void setPolicy(String policy) {
        this.policy = policy;
    }

    /**
     * <p>
     * The tag policy to attach to the target.
     * </p>
     * 
     * @return The tag policy to attach to the target.
     */

    public String getPolicy() {
        return this.policy;
    }

    /**
     * <p>
     * The tag policy to attach to the target.
     * </p>
     * 
     * @param policy
     *        The tag policy to attach to the target.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutTagPolicyRequest withPolicy(String policy) {
        setPolicy(policy);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getTargetId() != null)
            sb.append("TargetId: ").append(getTargetId()).append(",");
        if (getPolicy() != null)
            sb.append("Policy: ").append(getPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutTagPolicyRequest == false)
            return false;
        PutTagPolicyRequest other = (PutTagPolicyRequest) obj;
        if (other.getTargetId() == null ^ this.getTargetId() == null)
            return false;
        if (other.getTargetId() != null && other.getTargetId().equals(this.getTargetId()) == false)
            return false;
        if (other.getPolicy() == null ^ this.getPolicy() == null)
            return false;
        if (other.getPolicy() != null && other.getPolicy().equals(this.getPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTargetId() == null) ? 0 : getTargetId().hashCode());
        hashCode = prime * hashCode + ((getPolicy() == null) ? 0 : getPolicy().hashCode());
        return hashCode;
    }

    @Override
    public PutTagPolicyRequest clone() {
        return (PutTagPolicyRequest) super.clone();
    }

}

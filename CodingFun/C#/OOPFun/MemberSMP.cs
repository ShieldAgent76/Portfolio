// See https://aka.ms/new-console-template for more information
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace OOPReview
{
    interface IMemberInfo
    {
        public string Name { get; set; }
        public string Faction { get; set; }
        public abstract void SayQuote();
    }

    public abstract class MemberSMP : IMemberInfo
    {
        public abstract string Name { get; set; }
        public abstract string Faction { get; set; }

        public abstract void SayQuote();
    }
}
